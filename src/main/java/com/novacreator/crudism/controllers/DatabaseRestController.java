package com.novacreator.crudism.controllers;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jcabi.aspects.Loggable;

@RestController
public class DatabaseRestController {
	private static final Logger LOGGER = LoggerFactory.getLogger(DatabaseRestController.class);
	
	@Autowired
	private DataSource datasource;
	
	@Loggable(value = Loggable.INFO, name = "DatabaseRestController", trim = false)
	@RequestMapping("/services/database/list")
	public ResponseEntity<String> getDatabase() {
		try {
			Connection connection = datasource.getConnection();
			DatabaseDetails databaseDetails = new DatabaseDetails();
			databaseDetails.currentCatalog = connection.getCatalog();
			Properties properties = connection.getClientInfo();
			Enumeration<Object> clientInfoEnumeration = properties.keys();
			while(clientInfoEnumeration.hasMoreElements()) {
				String key = (String)clientInfoEnumeration.nextElement();
				databaseDetails.clientInfo.put(key, properties.getProperty(key));
			}
			databaseDetails.schema = connection.getSchema();
			
			DatabaseMetaData metadata = connection.getMetaData();
			databaseDetails.identifierQuote = metadata.getIdentifierQuoteString();
			ResultSet catalogsResultSet = metadata.getCatalogs();
			while(catalogsResultSet.next()) {
				databaseDetails.catalogs.add(catalogsResultSet.getString(1));
			}
			databaseDetails.catalogSeparator = metadata.getCatalogSeparator();
			databaseDetails.catalogTerm = metadata.getCatalogTerm();
			ResultSet clientInfoPropertiesResultSet = metadata.getClientInfoProperties();
			while(clientInfoPropertiesResultSet.next()) {
				ClientInfo clientInfo = new ClientInfo();
				clientInfo.data.name = clientInfoPropertiesResultSet.getString(1);
				clientInfo.data.maxLength = clientInfoPropertiesResultSet.getInt(1);
				clientInfo.data.defaultValue = clientInfoPropertiesResultSet.getString(2);
				clientInfo.data.description = clientInfoPropertiesResultSet.getString(3);
				databaseDetails.metadataClientInfo.add(clientInfo);
			}
			databaseDetails.databaseMajorVersion = metadata.getDatabaseMajorVersion();
			databaseDetails.databaseMinorVersion = metadata.getDatabaseMinorVersion();
			databaseDetails.databaseProductName = metadata.getDatabaseProductName();
			databaseDetails.databaseProductVersion = metadata.getDatabaseProductVersion();
			databaseDetails.defaultTransactionIsolation = metadata.getDefaultTransactionIsolation();
			databaseDetails.driverMajorVersion = metadata.getDriverMajorVersion();
			databaseDetails.driverMinorVersion = metadata.getDriverMinorVersion();
			databaseDetails.driverName = metadata.getDriverName();
			databaseDetails.driverVersion = metadata.getDriverVersion();
			databaseDetails.jdbcMajorVersion = metadata.getJDBCMajorVersion();
			databaseDetails.jdbcMinorVersion = metadata.getJDBCMinorVersion();
			databaseDetails.maxBinaryLiteralLength = metadata.getMaxBinaryLiteralLength();
			databaseDetails.maxCatalogNameLength = metadata.getMaxCatalogNameLength();
			databaseDetails.maxCharLiteralLength = metadata.getMaxCharLiteralLength();
			databaseDetails.maxColumnNameLength = metadata.getMaxColumnNameLength();
			databaseDetails.maxColumnsInGroupBy = metadata.getMaxColumnsInGroupBy();
			databaseDetails.maxColumnsInIndex = metadata.getMaxColumnsInIndex();
			databaseDetails.maxColumnsInOrderBy = metadata.getMaxColumnsInOrderBy();
			databaseDetails.maxColumnsInSelect = metadata.getMaxColumnsInSelect();
			databaseDetails.maxColumnsInTable = metadata.getMaxColumnsInTable();
			databaseDetails.maxConnections = metadata.getMaxConnections();
			databaseDetails.maxCursorNameLength = metadata.getMaxCursorNameLength();
			databaseDetails.maxIndexLength = metadata.getMaxIndexLength();
			databaseDetails.maxLogicalLobSize = metadata.getMaxLogicalLobSize();
			databaseDetails.maxProcedureNameLength = metadata.getMaxProcedureNameLength();
			databaseDetails.maxRowSize = metadata.getMaxRowSize();
			databaseDetails.maxSchemaNameLength = metadata.getMaxSchemaNameLength();
			databaseDetails.maxStatementLength = metadata.getMaxStatementLength();
			databaseDetails.maxStatements = metadata.getMaxStatements();
			databaseDetails.maxTableNameLength = metadata.getMaxTableNameLength();
			databaseDetails.maxTablesInSelect = metadata.getMaxTablesInSelect();
			databaseDetails.maxUserNameLength = metadata.getMaxUserNameLength();
			String numericFunctions = metadata.getNumericFunctions();
			if(numericFunctions != null && !numericFunctions.isEmpty()) {
				databaseDetails.numericFunctions.addAll(Arrays.asList(numericFunctions.split(",")));
			}
			databaseDetails.procedureTerm = metadata.getProcedureTerm();

			ResultSet schemasResultSet = metadata.getSchemas();
			while(schemasResultSet.next()) {
				SchemaDetails schemaDetails = new SchemaDetails();
				schemaDetails.data.schemaName = schemasResultSet.getString(1);
				schemaDetails.data.catalogName = schemasResultSet.getString(2);
				databaseDetails.schemas.add(schemaDetails);
			}
			ResultSet schemaInfoResultSet = metadata.getSchemas(null, null);
			while(schemaInfoResultSet.next()) {
				SchemaDetails schemaDetails = new SchemaDetails();
				schemaDetails.data.schemaName = schemasResultSet.getString(1);
				schemaDetails.data.catalogName = schemasResultSet.getString(2);
				databaseDetails.schemas.add(schemaDetails);
			}
			
			databaseDetails.schemaTerm = metadata.getSchemaTerm();
			databaseDetails.searchStringEscape = metadata.getSearchStringEscape();
			String sqlKeywords = metadata.getSQLKeywords();
			if(sqlKeywords != null && !sqlKeywords.isEmpty()) {
				databaseDetails.sqlKeywords.addAll(Arrays.asList(sqlKeywords.split(",")));
			}
			String stringFunctions = metadata.getStringFunctions();
			if(stringFunctions != null && !stringFunctions.isEmpty()) {
				databaseDetails.stringFunctions.addAll(Arrays.asList(stringFunctions.split(",")));
			}
			String systemFunctions = metadata.getSystemFunctions();
			if(systemFunctions != null && !systemFunctions.isEmpty()) {
				databaseDetails.systemFunctions.addAll(Arrays.asList(systemFunctions.split(",")));
			}
			String timeDateFunctions = metadata.getSystemFunctions();
			if(timeDateFunctions != null && !timeDateFunctions.isEmpty()) {
				databaseDetails.timeDateFunctions.addAll(Arrays.asList(timeDateFunctions.split(",")));
			}
			ResultSet tableTypesResultSet = metadata.getTableTypes();
			while(tableTypesResultSet.next()) {
				databaseDetails.tableTypes.add(tableTypesResultSet.getString(1));
			}
			ResultSet typeInfosResultSet = metadata.getTypeInfo();
			while(typeInfosResultSet.next()) {
				TypeInfo typeInfo = new TypeInfo();
				typeInfo.typeName = typeInfosResultSet.getString(1);
				typeInfo.dataType = typeInfosResultSet.getString(2);
				typeInfo.precission = typeInfosResultSet.getInt(3);
				typeInfo.literalPrefix = typeInfosResultSet.getString(4);
				typeInfo.literalSuffix = typeInfosResultSet.getString(5);
				typeInfo.createParams = typeInfosResultSet.getString(6);
				typeInfo.nullable = typeInfosResultSet.getShort(7);
				typeInfo.caseSensitive = typeInfosResultSet.getBoolean(8);
				typeInfo.searchable = typeInfosResultSet.getBoolean(9);
				typeInfo.unsignedAttribute = typeInfosResultSet.getBoolean(10);
				typeInfo.fixedPrecissionScale = typeInfosResultSet.getBoolean(11);
				typeInfo.autoIncrement = typeInfosResultSet.getBoolean(11);
				typeInfo.localTypeName = typeInfosResultSet.getString(13);
				typeInfo.minimumScale = typeInfosResultSet.getShort(14);
				typeInfo.maximumScale = typeInfosResultSet.getShort(15);
				typeInfo.numberPrecissionRadix = typeInfosResultSet.getInt(18);
				databaseDetails.typeInfos.add(typeInfo);
			}
			databaseDetails.url = metadata.getURL();
			databaseDetails.userName = metadata.getUserName();
			
			ResultSet tablesResultSet = metadata.getTables(null, null, null, null);
			while(tablesResultSet.next()) {
				TableDetails tableDetails = new TableDetails();
				tableDetails.data.catalog = tablesResultSet.getString(1);
				tableDetails.data.schema = tablesResultSet.getString(2);
				tableDetails.data.name = tablesResultSet.getString(3);
				tableDetails.data.type = tablesResultSet.getString(4);
				tableDetails.data.remarks = tablesResultSet.getString(5);
				tableDetails.data.typeCatalog = tablesResultSet.getString(6);
				tableDetails.data.typeSchema = tablesResultSet.getString(7);
				tableDetails.data.typeName = tablesResultSet.getString(8);
				tableDetails.data.selfReferencingColumnName = tablesResultSet.getString(9);
				tableDetails.data.referenceGeneration = tablesResultSet.getString(10);
				databaseDetails.tableDetails.add(tableDetails);
			}
			ResultSet attributesResultSet = metadata.getAttributes(null, null, null, null);
			while(attributesResultSet.next()) {
				Attribute attribute = new Attribute();
				attribute.data.typeSchema = attributesResultSet.getString(1);
				attribute.data.typeCatalog = attributesResultSet.getString(2);
				attribute.data.typeName =  attributesResultSet.getString(3);
				attribute.data.attributeName = attributesResultSet.getString(4);
				attribute.data.dataType = attributesResultSet.getInt(5);
				attribute.data.attributeTypeName = attributesResultSet.getString(6);
				attribute.data.attributeSize = attributesResultSet.getInt(7);
				attribute.data.decimalDigits = attributesResultSet.getInt(8);
				attribute.data.numberPrecissionRadix = attributesResultSet.getInt(9);
				attribute.data.nullable = attributesResultSet.getInt(10);
				attribute.data.remarks = attributesResultSet.getString(11);
				attribute.data.attributeDefinition = attributesResultSet.getString(12);
				attribute.data.charOctetLength = attributesResultSet.getInt(15);
				attribute.data.ordinalPosition = attributesResultSet.getInt(16);
				attribute.data.isNullable = attributesResultSet.getString(17);
				attribute.data.scopeCatalog = attributesResultSet.getString(18);
				attribute.data.scopeSchema = attributesResultSet.getString(19);
				attribute.data.scopeTable = attributesResultSet.getString(20);
				attribute.data.sourceDataType = attributesResultSet.getShort(21);
				databaseDetails.attributes.add(attribute);
			}
			
			ResultSet columnsResultSet = metadata.getColumns(null, null, null, null);
			while(columnsResultSet.next()) {
				Column column = new Column();
				column.data.tableCatalog = columnsResultSet.getString(1);
				column.data.tableSchema = columnsResultSet.getString(2);
				column.data.tableName = columnsResultSet.getString(3);
				column.data.name = columnsResultSet.getString(4);
				column.data.dataType = columnsResultSet.getInt(5);
				column.data.typeName = columnsResultSet.getString(6);
				column.data.columnSize = columnsResultSet.getInt(7);
				column.data.decimalDigits = columnsResultSet.getInt(9);
				column.data.numberPrecissionRadix = columnsResultSet.getInt(10);
				column.data.nullable = columnsResultSet.getInt(11);
				column.data.remarks = columnsResultSet.getString(12);
				column.data.columnDefinition = columnsResultSet.getString(13);
				column.data.charOctetLength = columnsResultSet.getInt(16);
				column.data.ordinalPosition = columnsResultSet.getInt(17);
				column.data.isNullable = columnsResultSet.getString(18);
				column.data.scopeCatalog = columnsResultSet.getString(19);
				column.data.scopeSchema = columnsResultSet.getString(20);
				column.data.scopeTable = columnsResultSet.getString(21);
				column.data.sourceDataType = columnsResultSet.getShort(22);
				column.data.isAutoincrement = columnsResultSet.getString(23);
				column.data.isGeneratedColumn = columnsResultSet.getString(24);
				databaseDetails.columns.add(column);
			}
			
			ResultSet tablePrivilegesResultSet = metadata.getTablePrivileges(null, null, null);
			while(tablePrivilegesResultSet.next()) {
				TablePrivilege tablePrivilege = new TablePrivilege();
				tablePrivilege.data.tableCatalog = tablePrivilegesResultSet.getString(1);
				tablePrivilege.data.tableSchema = tablePrivilegesResultSet.getString(2);
				tablePrivilege.data.tableName = tablePrivilegesResultSet.getString(3);
				tablePrivilege.data.grantor = tablePrivilegesResultSet.getString(5);
				tablePrivilege.data.grantee = tablePrivilegesResultSet.getString(6);
				tablePrivilege.data.privilege = tablePrivilegesResultSet.getString(7);
				tablePrivilege.data.isGrantable = tablePrivilegesResultSet.getString(8);
				databaseDetails.tablePrivileges.add(tablePrivilege);				
			}
			
			ResultSet columnPrivilegesResultSet = metadata.getColumnPrivileges(null, null, null, null);
			while(columnPrivilegesResultSet.next()) {
				ColumnPrivilege columnPrivilege = new ColumnPrivilege();
				columnPrivilege.data.tableCatalog = columnPrivilegesResultSet.getString(1);
				columnPrivilege.data.tableSchema = columnPrivilegesResultSet.getString(2);
				columnPrivilege.data.tableName = columnPrivilegesResultSet.getString(3);
				columnPrivilege.data.columnName = columnPrivilegesResultSet.getString(4);
				columnPrivilege.data.grantor = columnPrivilegesResultSet.getString(5);
				columnPrivilege.data.grantee = columnPrivilegesResultSet.getString(6);
				columnPrivilege.data.privilege = columnPrivilegesResultSet.getString(7);
				columnPrivilege.data.isGrantable = columnPrivilegesResultSet.getString(8);
				databaseDetails.columnPrivileges.add(columnPrivilege);
			}
			
			ResultSet pseudoColumnsResultSet = metadata.getPseudoColumns(null, null, null, null);
			while(pseudoColumnsResultSet.next()) {
				PseudoColumn pseudoColumn = new PseudoColumn();
				pseudoColumn.data.tableCatalog = pseudoColumnsResultSet.getString(1);
				pseudoColumn.data.tableSchema = pseudoColumnsResultSet.getString(2);
				pseudoColumn.data.tableName = pseudoColumnsResultSet.getString(3);
				pseudoColumn.data.columnName = pseudoColumnsResultSet.getString(4);
				pseudoColumn.data.dataType = pseudoColumnsResultSet.getInt(5);
				pseudoColumn.data.columnSize = pseudoColumnsResultSet.getInt(6);
				pseudoColumn.data.decimalDigits = pseudoColumnsResultSet.getInt(7);
				pseudoColumn.data.numberPrecissionRadix = pseudoColumnsResultSet.getInt(8);
				pseudoColumn.data.columnUsage = pseudoColumnsResultSet.getString(9);
				pseudoColumn.data.remarks = pseudoColumnsResultSet.getString(10);
				pseudoColumn.data.charOctetLength = pseudoColumnsResultSet.getInt(11);
				pseudoColumn.data.isNullable = pseudoColumnsResultSet.getString(12);
				databaseDetails.pseudoColumns.add(pseudoColumn);
			}
			
			ResultSet functionColumnsResultSet = metadata.getFunctionColumns(null, null, null, null);
			while(functionColumnsResultSet.next()) {
				FunctionColumn functionColumn = new FunctionColumn();
				functionColumn.data.functionCatalog = functionColumnsResultSet.getString(1);
				functionColumn.data.functionSchema = functionColumnsResultSet.getString(2);
				functionColumn.data.functionName = functionColumnsResultSet.getString(3);
				functionColumn.data.columnName = functionColumnsResultSet.getString(4);
				functionColumn.data.columnType = functionColumnsResultSet.getShort(5);
				functionColumn.data.dataType = functionColumnsResultSet.getInt(6);
				functionColumn.data.typeName = functionColumnsResultSet.getString(7);
				functionColumn.data.precision = functionColumnsResultSet.getInt(8);
				functionColumn.data.length = functionColumnsResultSet.getInt(9);
				functionColumn.data.scale = functionColumnsResultSet.getShort(10);
				functionColumn.data.radix = functionColumnsResultSet.getShort(11);
				functionColumn.data.nullable = functionColumnsResultSet.getShort(12);
				databaseDetails.functionColumns.add(functionColumn);
			}
			
			ResultSet procedureColumnsResultSet = metadata.getProcedureColumns(null, null, null, null);
			while(procedureColumnsResultSet.next()) {
				ProcedureColumn procedureColumn = new ProcedureColumn();
				procedureColumn.data.procedureCatalog = procedureColumnsResultSet.getString(1);
				procedureColumn.data.procedureSchema = procedureColumnsResultSet.getString(2);
				procedureColumn.data.procedureName = procedureColumnsResultSet.getString(3);
				procedureColumn.data.columnName = procedureColumnsResultSet.getString(4);
				procedureColumn.data.columnType = procedureColumnsResultSet.getShort(5);
				procedureColumn.data.dataType = procedureColumnsResultSet.getInt(6);
				procedureColumn.data.typeName = procedureColumnsResultSet.getString(7);
				procedureColumn.data.precission = procedureColumnsResultSet.getInt(8);
				procedureColumn.data.length = procedureColumnsResultSet.getInt(9);
				procedureColumn.data.scale = procedureColumnsResultSet.getShort(10);
				procedureColumn.data.radix = procedureColumnsResultSet.getShort(11);
				procedureColumn.data.nullable = procedureColumnsResultSet.getShort(12);
				procedureColumn.data.remarks = procedureColumnsResultSet.getString(13);
				procedureColumn.data.columnDefaultValue = procedureColumnsResultSet.getString(14);
				procedureColumn.data.charOctetLength = procedureColumnsResultSet.getInt(17);
				procedureColumn.data.ordinalPosition = procedureColumnsResultSet.getInt(18);
				procedureColumn.data.isNullable = procedureColumnsResultSet.getString(19);
				procedureColumn.data.specificName = procedureColumnsResultSet.getString(20);
				databaseDetails.procedureColumns.add(procedureColumn);
			}
			
			ResultSet versionColumnsResultSet = metadata.getVersionColumns(null, null, null);
			while(versionColumnsResultSet.next()) {
				VersionColumn versionColumn = new VersionColumn();
				versionColumn.data.scope = versionColumnsResultSet.getShort(1);
				versionColumn.data.columnName = versionColumnsResultSet.getString(2);
				versionColumn.data.dataType = versionColumnsResultSet.getInt(3);
				versionColumn.data.typeName = versionColumnsResultSet.getString(4);
				versionColumn.data.columnSize = versionColumnsResultSet.getInt(5);
				versionColumn.data.bufferLength = versionColumnsResultSet.getInt(6);
				versionColumn.data.decimalDigits = versionColumnsResultSet.getInt(7);
				versionColumn.data.pseudoColumn = versionColumnsResultSet.getShort(8);
				databaseDetails.versionColumns.add(versionColumn);
			}

			ResultSet importedKeysResultSet = metadata.getImportedKeys(null, null, null);
			while(importedKeysResultSet.next()) {
				ImportedKey importedKey = new ImportedKey();
				importedKey.data.primaryKeyTableCatalog = importedKeysResultSet.getString(1);
				importedKey.data.primaryKeyTableSchema = importedKeysResultSet.getString(2);
				importedKey.data.primaryKeyTableName = importedKeysResultSet.getString(3);
				importedKey.data.primaryKeyColumnName = importedKeysResultSet.getString(4);
				importedKey.data.foreignKeyTableCatalog = importedKeysResultSet.getString(5);
				importedKey.data.foreignKeyTableSchema = importedKeysResultSet.getString(6);
				importedKey.data.foreignKeyTableName = importedKeysResultSet.getString(7);
				importedKey.data.foreignKeyColumnName = importedKeysResultSet.getString(8);
				importedKey.data.keySequenceNumber = importedKeysResultSet.getShort(9);
				importedKey.data.updateRule = importedKeysResultSet.getShort(10);
				importedKey.data.deleteRule = importedKeysResultSet.getShort(11);
				importedKey.data.foreignKeyName = importedKeysResultSet.getString(12);
				importedKey.data.primaryKeyName = importedKeysResultSet.getString(13);
				importedKey.data.deferrability = importedKeysResultSet.getShort(14);
				databaseDetails.importedKeys.add(importedKey);
			}

			ResultSet exportedKeysResultSet = metadata.getExportedKeys(null, null, null);
			while(exportedKeysResultSet.next()) {
				ExportedKey exportedKey = new ExportedKey();
				exportedKey.data.primaryKeyTableCatalog = exportedKeysResultSet.getString(1);
				exportedKey.data.primaryKeyTableSchema = exportedKeysResultSet.getString(2);
				exportedKey.data.primaryKeyTableName = exportedKeysResultSet.getString(3);
				exportedKey.data.primaryKeyColumnName = exportedKeysResultSet.getString(4);
				exportedKey.data.foreignKeyTableCatalog = exportedKeysResultSet.getString(5);
				exportedKey.data.foreignKeyTableSchema = exportedKeysResultSet.getString(6);
				exportedKey.data.foreignKeyTableName = exportedKeysResultSet.getString(7);
				exportedKey.data.foreignKeyColumnName = exportedKeysResultSet.getString(8);
				exportedKey.data.keySequenceNumber = exportedKeysResultSet.getShort(9);
				exportedKey.data.updateRule = exportedKeysResultSet.getShort(10);
				exportedKey.data.deleteRule = exportedKeysResultSet.getShort(11);
				exportedKey.data.foreignKeyName = exportedKeysResultSet.getString(12);
				exportedKey.data.primaryKeyName = exportedKeysResultSet.getString(13);
				exportedKey.data.deferrability = exportedKeysResultSet.getShort(14);
				databaseDetails.exportedKeys.add(exportedKey);
			}
			
			ResultSet functionsResultSet = metadata.getFunctions(null, null, null);
			while(functionsResultSet.next()) {
				Function function = new Function();
				function.data.functionCatalog = functionsResultSet.getString(1);
				function.data.functionSchema = functionsResultSet.getString(2);
				function.data.functionName = functionsResultSet.getString(3);
				function.data.remarks = functionsResultSet.getString(4);
				function.data.functionType = functionsResultSet.getShort(5);
				function.data.specificName = functionsResultSet.getString(6);
				databaseDetails.functions.add(function);
			}

			ResultSet userDefinedTypesResultSet = metadata.getUDTs(null, null, null, null);
			while(userDefinedTypesResultSet.next()) {
				UserDefinedType userDefinedType = new UserDefinedType();
				userDefinedType.data.typeCatalog = userDefinedTypesResultSet.getString(1);
				userDefinedType.data.typeSchema = userDefinedTypesResultSet.getString(2);
				userDefinedType.data.typeName = userDefinedTypesResultSet.getString(3);
				userDefinedType.data.classNmae = userDefinedTypesResultSet.getString(4);
				userDefinedType.data.dataType = userDefinedTypesResultSet.getInt(5);
				userDefinedType.data.remarks = userDefinedTypesResultSet.getString(6);
				userDefinedType.data.baseType = userDefinedTypesResultSet.getShort(7);
				databaseDetails.userDefinedTypes.add(userDefinedType);
			}

			ResultSet bestRowIdentifierResultSet = metadata.getBestRowIdentifier(null, null, null, 2, true);
			while(bestRowIdentifierResultSet.next()) {
				BestRowIdentifier bestRowIdentifier = new BestRowIdentifier();
				bestRowIdentifier.data.scope = bestRowIdentifierResultSet.getShort(1);
				bestRowIdentifier.data.columnName = bestRowIdentifierResultSet.getString(2);
				bestRowIdentifier.data.dataType = bestRowIdentifierResultSet.getInt(3);
				bestRowIdentifier.data.typeName = bestRowIdentifierResultSet.getString(4);
				bestRowIdentifier.data.columnSize = bestRowIdentifierResultSet.getInt(5);
				bestRowIdentifier.data.decimalDigits = bestRowIdentifierResultSet.getShort(7);
				bestRowIdentifier.data.pseudoColumn = bestRowIdentifierResultSet.getShort(8);
				databaseDetails.bestRowIdentifiers.add(bestRowIdentifier);
			}
			
			ResultSet crossReferenceResultSet = metadata.getCrossReference(null, null, null, null, null, null);
			while(crossReferenceResultSet.next()) {
				CrossReference crossReference = new CrossReference();
				crossReference.data.parentKeyTableCatalog = crossReferenceResultSet.getString(1);
				crossReference.data.parentKeyTableSchema = crossReferenceResultSet.getString(2);
				crossReference.data.parentKeyTableName = crossReferenceResultSet.getString(3);
				crossReference.data.parentKeyTableColumnName = crossReferenceResultSet.getString(4);
				crossReference.data.foreignKeyTableCatalog = crossReferenceResultSet.getString(5);
				crossReference.data.foreignKeyTableSchema = crossReferenceResultSet.getString(6);
				crossReference.data.foreignKeyTableName = crossReferenceResultSet.getString(7);
				crossReference.data.foreignKeyColumnName = crossReferenceResultSet.getString(8);
				crossReference.data.sequenceNumber = crossReferenceResultSet.getShort(9);
				crossReference.data.updateRule = crossReferenceResultSet.getShort(10);
				crossReference.data.deleteRule = crossReferenceResultSet.getShort(11);
				crossReference.data.foreignKeyName = crossReferenceResultSet.getString(12);
				crossReference.data.parentKeyName = crossReferenceResultSet.getString(13);
				crossReference.data.deferrability = crossReferenceResultSet.getShort(14);
				databaseDetails.crossReferences.add(crossReference);
			}

			ResultSet primaryKeysResultSet = metadata.getPrimaryKeys(null, null, null);
			while(primaryKeysResultSet.next()) {
				PrimaryKey primaryKey = new PrimaryKey();
				primaryKey.data.tableCatalog = primaryKeysResultSet.getString(1);
				primaryKey.data.tableSchema = primaryKeysResultSet.getString(2);
				primaryKey.data.tableName = primaryKeysResultSet.getString(3);
				primaryKey.data.columnName = primaryKeysResultSet.getString(4);
				primaryKey.data.keySequence = primaryKeysResultSet.getShort(5);
				primaryKey.data.primaryKeyName = primaryKeysResultSet.getString(6);
				databaseDetails.primaryKeys.add(primaryKey);
			}

			ResultSet indexInfosResultSet = metadata.getIndexInfo(null, null, null, false, false);
			while(indexInfosResultSet.next()) {
				IndexInfo indexInfo = new IndexInfo();
				indexInfo.data.tableCatalog = indexInfosResultSet.getString(1);
				indexInfo.data.tableSchema = indexInfosResultSet.getString(2);
				indexInfo.data.tableName = indexInfosResultSet.getString(3);
				indexInfo.data.nonUnique = indexInfosResultSet.getBoolean(4);
				indexInfo.data.indexQualifier = indexInfosResultSet.getString(5);
				indexInfo.data.indexName = indexInfosResultSet.getString(6);
				indexInfo.data.type = indexInfosResultSet.getShort(7);
				indexInfo.data.ordinalPosition = indexInfosResultSet.getShort(8);
				indexInfo.data.columnName = indexInfosResultSet.getString(9);
				indexInfo.data.ascendingOrDescending = indexInfosResultSet.getString(10);
				indexInfo.data.cardinality = indexInfosResultSet.getLong(11);
				indexInfo.data.pages = indexInfosResultSet.getLong(12);
				indexInfo.data.filterCondition = indexInfosResultSet.getString(13);
				databaseDetails.indexInfos.add(indexInfo);
			}
 
			ResultSet proceduresResultSet = metadata.getProcedures(null, null, null);
			while(proceduresResultSet.next()) {
				Procedure procedure = new Procedure();
				procedure.data.procedureCatalog = proceduresResultSet.getString(1); 
				procedure.data.procedureSchema = proceduresResultSet.getString(2);
				procedure.data.procedureName = proceduresResultSet.getString(3);
				procedure.data.remarks = proceduresResultSet.getString(7);
				procedure.data.procedureType = proceduresResultSet.getShort(8);
				procedure.data.specificName = proceduresResultSet.getString(9);
				databaseDetails.procedures.add(procedure);
			}
			
			ResultSet superTablesResultSet = metadata.getSuperTables(null, null, null);
			while(superTablesResultSet.next()) {
				SuperTable superTable = new SuperTable();
				superTable.data.tableCatalog = superTablesResultSet.getString(1);
				superTable.data.tableSchema = superTablesResultSet.getString(2);
				superTable.data.tableName = superTablesResultSet.getString(3);
				superTable.data.superTableName = superTablesResultSet.getString(4);
				databaseDetails.superTables.add(superTable);
			}
			
			ResultSet superTypesResultSet = metadata.getSuperTypes(null, null, null);
			while(superTypesResultSet.next()) {
				SuperType superType = new SuperType();
				superType.typeCatalog = superTypesResultSet.getString(1);
				superType.typeSchema = superTypesResultSet.getString(2);
				superType.superTypeCatalog = superTypesResultSet.getString(3);
				superType.superTypeSchema = superTypesResultSet.getString(4);
				superType.superTypeName = superTypesResultSet.getString(5);
				databaseDetails.superTypes.add(superType);
			}
						
			connection.close();
			return new ResponseEntity<>("{\"result\": \"SUCCESS\"}", HttpStatus.OK);
		} catch(Exception e) {
			LOGGER.error(e.getMessage(), e);
			return new ResponseEntity<>(new StringBuilder("{\"result\": \"").append(e.getMessage()).append("\"}").toString(), HttpStatus.NOT_FOUND);
		} 
	}	
}
