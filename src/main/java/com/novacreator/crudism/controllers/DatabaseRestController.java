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
			databaseDetails.setCurrentCatalog(connection.getCatalog());
			Properties properties = connection.getClientInfo();
			Enumeration<Object> clientInfoEnumeration = properties.keys();
			while(clientInfoEnumeration.hasMoreElements()) {
				String key = (String)clientInfoEnumeration.nextElement();
				databaseDetails.addToClientInfo(key, properties.getProperty(key));
			}
			databaseDetails.setSchema(connection.getSchema());
			
			DatabaseMetaData metadata = connection.getMetaData();
			databaseDetails.setIdentifierQuote(metadata.getIdentifierQuoteString());
			ResultSet catalogsResultSet = metadata.getCatalogs();
			while(catalogsResultSet.next()) {
				databaseDetails.addToCatalogs(catalogsResultSet.getString(1));
			}
			databaseDetails.setCatalogSeparator(metadata.getCatalogSeparator());
			databaseDetails.setCatalogTerm(metadata.getCatalogTerm());
			ResultSet clientInfoPropertiesResultSet = metadata.getClientInfoProperties();
			while(clientInfoPropertiesResultSet.next()) {
				ClientInfo clientInfo = new ClientInfo();
				clientInfo.setName(clientInfoPropertiesResultSet.getString(1));
				clientInfo.setMaxLength(clientInfoPropertiesResultSet.getInt(1));
				clientInfo.setDefaultValue(clientInfoPropertiesResultSet.getString(2));
				clientInfo.setDescription(clientInfoPropertiesResultSet.getString(3));
				databaseDetails.addToMetadataClientInfos(clientInfo);
			}
			databaseDetails.setDatabaseMajorVersion(metadata.getDatabaseMajorVersion());
			databaseDetails.setDatabaseMinorVersion(metadata.getDatabaseMinorVersion());
			databaseDetails.setDatabaseProductName(metadata.getDatabaseProductName());
			databaseDetails.setDatabaseProductVersion(metadata.getDatabaseProductVersion());
			databaseDetails.setDefaultTransactionIsolation(metadata.getDefaultTransactionIsolation());
			databaseDetails.setDriverMajorVersion(metadata.getDriverMajorVersion());
			databaseDetails.setDriverMinorVersion(metadata.getDriverMinorVersion());
			databaseDetails.setDriverName(metadata.getDriverName());
			databaseDetails.setDriverVersion(metadata.getDriverVersion());
			databaseDetails.setJdbcMajorVersion(metadata.getJDBCMajorVersion());
			databaseDetails.setJdbcMinorVersion(metadata.getJDBCMinorVersion());
			databaseDetails.setMaxBinaryLiteralLength(metadata.getMaxBinaryLiteralLength());
			databaseDetails.setMaxCatalogNameLength(metadata.getMaxCatalogNameLength());
			databaseDetails.setMaxCharLiteralLength(metadata.getMaxCharLiteralLength());
			databaseDetails.setMaxColumnNameLength(metadata.getMaxColumnNameLength());
			databaseDetails.setMaxColumnsInGroupBy(metadata.getMaxColumnsInGroupBy());
			databaseDetails.setMaxColumnsInIndex(metadata.getMaxColumnsInIndex());
			databaseDetails.setMaxColumnsInOrderBy(metadata.getMaxColumnsInOrderBy());
			databaseDetails.setMaxColumnsInSelect(metadata.getMaxColumnsInSelect());
			databaseDetails.setMaxColumnsInTable(metadata.getMaxColumnsInTable());
			databaseDetails.setMaxConnections(metadata.getMaxConnections());
			databaseDetails.setMaxCursorNameLength(metadata.getMaxCursorNameLength());
			databaseDetails.setMaxIndexLength(metadata.getMaxIndexLength());
			databaseDetails.setMaxLogicalLobSize(metadata.getMaxLogicalLobSize());
			databaseDetails.setMaxProcedureNameLength(metadata.getMaxProcedureNameLength());
			databaseDetails.setMaxRowSize(metadata.getMaxRowSize());
			databaseDetails.setMaxSchemaNameLength(metadata.getMaxSchemaNameLength());
			databaseDetails.setMaxStatementLength(metadata.getMaxStatementLength());
			databaseDetails.setMaxStatements(metadata.getMaxStatements());
			databaseDetails.setMaxTableNameLength(metadata.getMaxTableNameLength());
			databaseDetails.setMaxTablesInSelect(metadata.getMaxTablesInSelect());
			databaseDetails.setMaxUserNameLength(metadata.getMaxUserNameLength());
			String numericFunctions = metadata.getNumericFunctions();
			if(numericFunctions != null && !numericFunctions.isEmpty()) {
				databaseDetails.addAllToNumericFunctions(Arrays.asList(numericFunctions.split(",")));
			}
			databaseDetails.setProcedureTerm(metadata.getProcedureTerm());

			ResultSet schemasResultSet = metadata.getSchemas();
			while(schemasResultSet.next()) {
				SchemaDetails schemaDetails = new SchemaDetails();
				schemaDetails.setSchemaName(schemasResultSet.getString(1));
				schemaDetails.setCatalogName(schemasResultSet.getString(2));
				databaseDetails.addToSchemas(schemaDetails);
			}
			ResultSet schemaInfoResultSet = metadata.getSchemas(null, null);
			while(schemaInfoResultSet.next()) {
				SchemaDetails schemaDetails = new SchemaDetails();
				schemaDetails.setSchemaName(schemasResultSet.getString(1));
				schemaDetails.setCatalogName(schemasResultSet.getString(2));
				databaseDetails.addToSchemas(schemaDetails);
			}
			
			databaseDetails.setSchemaTerm(metadata.getSchemaTerm());
			databaseDetails.setSearchStringEscape(metadata.getSearchStringEscape());
			String sqlKeywords = metadata.getSQLKeywords();
			if(sqlKeywords != null && !sqlKeywords.isEmpty()) {
				databaseDetails.addAllToSqlKeywords(Arrays.asList(sqlKeywords.split(",")));
			}
			String stringFunctions = metadata.getStringFunctions();
			if(stringFunctions != null && !stringFunctions.isEmpty()) {
				databaseDetails.addAllToStringFunctions(Arrays.asList(stringFunctions.split(",")));
			}
			String systemFunctions = metadata.getSystemFunctions();
			if(systemFunctions != null && !systemFunctions.isEmpty()) {
				databaseDetails.addAllToSystemFunctions(Arrays.asList(systemFunctions.split(",")));
			}
			String timeDateFunctions = metadata.getSystemFunctions();
			if(timeDateFunctions != null && !timeDateFunctions.isEmpty()) {
				databaseDetails.addAllToTimeDateFunctions(Arrays.asList(timeDateFunctions.split(",")));
			}
			ResultSet tableTypesResultSet = metadata.getTableTypes();
			while(tableTypesResultSet.next()) {
				databaseDetails.addToTableTypes(tableTypesResultSet.getString(1));
			}
			ResultSet typeInfosResultSet = metadata.getTypeInfo();
			while(typeInfosResultSet.next()) {
				TypeInfo typeInfo = new TypeInfo();
				typeInfo.setTypeName(typeInfosResultSet.getString(1));
				typeInfo.setDataType(typeInfosResultSet.getString(2));
				typeInfo.setPrecission(typeInfosResultSet.getInt(3));
				typeInfo.setLiteralPrefix(typeInfosResultSet.getString(4));
				typeInfo.setLiteralSuffix(typeInfosResultSet.getString(5));
				typeInfo.setCreateParams(typeInfosResultSet.getString(6));
				typeInfo.setNullable(typeInfosResultSet.getShort(7));
				typeInfo.setCaseSensitive(typeInfosResultSet.getBoolean(8));
				typeInfo.setSearchable(typeInfosResultSet.getBoolean(9));
				typeInfo.setUnsignedAttribute(typeInfosResultSet.getBoolean(10));
				typeInfo.setFixedPrecissionScale(typeInfosResultSet.getBoolean(11));
				typeInfo.setAutoIncrement(typeInfosResultSet.getBoolean(11));
				typeInfo.setLocalTypeName(typeInfosResultSet.getString(13));
				typeInfo.setMinimumScale(typeInfosResultSet.getShort(14));
				typeInfo.setMaximumScale(typeInfosResultSet.getShort(15));
				typeInfo.setNumberPrecissionRadix(typeInfosResultSet.getInt(18));
				databaseDetails.addToTypeInfos(typeInfo);
			}
			databaseDetails.setUrl(metadata.getURL());
			databaseDetails.setUserName(metadata.getUserName());
			
			ResultSet tablesResultSet = metadata.getTables(null, null, null, null);
			while(tablesResultSet.next()) {
				TableDetails tableDetails = new TableDetails();
				tableDetails.setCatalog(tablesResultSet.getString(1));
				tableDetails.setSchema(tablesResultSet.getString(2));
				tableDetails.setName(tablesResultSet.getString(3));
				tableDetails.setType(tablesResultSet.getString(4));
				tableDetails.setRemarks(tablesResultSet.getString(5));
				tableDetails.setTypeCatalog(tablesResultSet.getString(6));
				tableDetails.setTypeSchema(tablesResultSet.getString(7));
				tableDetails.setTypeName(tablesResultSet.getString(8));
				tableDetails.setSelfReferencingColumnName(tablesResultSet.getString(9));
				tableDetails.setReferenceGeneration(tablesResultSet.getString(10));
				databaseDetails.addToTableDetails(tableDetails);
			}
			ResultSet attributesResultSet = metadata.getAttributes(null, null, null, null);
			while(attributesResultSet.next()) {
				Attribute attribute = new Attribute();
				attribute.setTypeSchema(attributesResultSet.getString(1));
				attribute.setTypeCatalog(attributesResultSet.getString(2));
				attribute.setTypeName(attributesResultSet.getString(3));
				attribute.setAttributeName(attributesResultSet.getString(4));
				attribute.setDataType(attributesResultSet.getInt(5));
				attribute.setAttributeTypeName(attributesResultSet.getString(6));
				attribute.setAttributeSize(attributesResultSet.getInt(7));
				attribute.setDecimalDigits(attributesResultSet.getInt(8));
				attribute.setNumberPrecissionRadix(attributesResultSet.getInt(9));
				attribute.setNullable(attributesResultSet.getInt(10));
				attribute.setRemarks(attributesResultSet.getString(11));
				attribute.setAttributeDefinition(attributesResultSet.getString(12));
				attribute.setCharOctetLength(attributesResultSet.getInt(15));
				attribute.setOrdinalPosition(attributesResultSet.getInt(16));
				attribute.setIsNullable(attributesResultSet.getString(17));
				attribute.setScopeCatalog(attributesResultSet.getString(18));
				attribute.setScopeSchema(attributesResultSet.getString(19));
				attribute.setScopeTable(attributesResultSet.getString(20));
				attribute.setSourceDataType(attributesResultSet.getShort(21));
				databaseDetails.addToAttributes(attribute);
			}
			
			ResultSet columnsResultSet = metadata.getColumns(null, null, null, null);
			while(columnsResultSet.next()) {
				Column column = new Column();
				column.setTableCatalog(columnsResultSet.getString(1));
				column.setTableSchema(columnsResultSet.getString(2));
				column.setTableName(columnsResultSet.getString(3));
				column.setName(columnsResultSet.getString(4));
				column.setDataType(columnsResultSet.getInt(5));
				column.setTypeName(columnsResultSet.getString(6));
				column.setColumnSize(columnsResultSet.getInt(7));
				column.setDecimalDigits(columnsResultSet.getInt(9));
				column.setNumberPrecissionRadix(columnsResultSet.getInt(10));
				column.setNullable(columnsResultSet.getInt(11));
				column.setRemarks(columnsResultSet.getString(12));
				column.setColumnDefinition(columnsResultSet.getString(13));
				column.setCharOctetLength(columnsResultSet.getInt(16));
				column.setOrdinalPosition(columnsResultSet.getInt(17));
				column.setIsNullable(columnsResultSet.getString(18));
				column.setScopeCatalog(columnsResultSet.getString(19));
				column.setScopeSchema(columnsResultSet.getString(20));
				column.setScopeTable(columnsResultSet.getString(21));
				column.setSourceDataType(columnsResultSet.getShort(22));
				column.setIsAutoincrement(columnsResultSet.getString(23));
				column.setIsGeneratedColumn(columnsResultSet.getString(24));
				databaseDetails.addToColumns(column);
			}
			
			ResultSet tablePrivilegesResultSet = metadata.getTablePrivileges(null, null, null);
			while(tablePrivilegesResultSet.next()) {
				TablePrivilege tablePrivilege = new TablePrivilege();
				tablePrivilege.setTableCatalog(tablePrivilegesResultSet.getString(1));
				tablePrivilege.setTableSchema(tablePrivilegesResultSet.getString(2));
				tablePrivilege.setTableName(tablePrivilegesResultSet.getString(3));
				tablePrivilege.setGrantor(tablePrivilegesResultSet.getString(5));
				tablePrivilege.setGrantee(tablePrivilegesResultSet.getString(6));
				tablePrivilege.setPrivilege(tablePrivilegesResultSet.getString(7));
				tablePrivilege.setIsGrantable(tablePrivilegesResultSet.getString(8));
				databaseDetails.addToTablePrivileges(tablePrivilege);
			}
			
			ResultSet columnPrivilegesResultSet = metadata.getColumnPrivileges(null, null, null, null);
			while(columnPrivilegesResultSet.next()) {
				ColumnPrivilege columnPrivilege = new ColumnPrivilege();
				columnPrivilege.setTableCatalog(columnPrivilegesResultSet.getString(1));
				columnPrivilege.setTableSchema(columnPrivilegesResultSet.getString(2));
				columnPrivilege.setTableName(columnPrivilegesResultSet.getString(3));
				columnPrivilege.setColumnName(columnPrivilegesResultSet.getString(4));
				columnPrivilege.setGrantor(columnPrivilegesResultSet.getString(5));
				columnPrivilege.setGrantee(columnPrivilegesResultSet.getString(6));
				columnPrivilege.setPrivilege(columnPrivilegesResultSet.getString(7));
				columnPrivilege.setIsGrantable(columnPrivilegesResultSet.getString(8));
				databaseDetails.addToColumnPrivileges(columnPrivilege);
			}
			
			ResultSet pseudoColumnsResultSet = metadata.getPseudoColumns(null, null, null, null);
			while(pseudoColumnsResultSet.next()) {
				PseudoColumn pseudoColumn = new PseudoColumn();
				pseudoColumn.setTableCatalog(pseudoColumnsResultSet.getString(1));
				pseudoColumn.setTableSchema(pseudoColumnsResultSet.getString(2));
				pseudoColumn.setTableName(pseudoColumnsResultSet.getString(3));
				pseudoColumn.setColumnName(pseudoColumnsResultSet.getString(4));
				pseudoColumn.setDataType(pseudoColumnsResultSet.getInt(5));
				pseudoColumn.setColumnSize(pseudoColumnsResultSet.getInt(6));
				pseudoColumn.setDecimalDigits(pseudoColumnsResultSet.getInt(7));
				pseudoColumn.setNumberPrecissionRadix(pseudoColumnsResultSet.getInt(8));
				pseudoColumn.setColumnUsage(pseudoColumnsResultSet.getString(9));
				pseudoColumn.setRemarks(pseudoColumnsResultSet.getString(10));
				pseudoColumn.setCharOctetLength(pseudoColumnsResultSet.getInt(11));
				pseudoColumn.setIsNullable(pseudoColumnsResultSet.getString(12));
				databaseDetails.addToPseudoColumns(pseudoColumn);
			}
			
			ResultSet functionColumnsResultSet = metadata.getFunctionColumns(null, null, null, null);
			while(functionColumnsResultSet.next()) {
				FunctionColumn functionColumn = new FunctionColumn();
				functionColumn.setFunctionCatalog(functionColumnsResultSet.getString(1));
				functionColumn.setFunctionSchema(functionColumnsResultSet.getString(2));
				functionColumn.setFunctionName(functionColumnsResultSet.getString(3));
				functionColumn.setColumnName(functionColumnsResultSet.getString(4));
				functionColumn.setColumnType(functionColumnsResultSet.getShort(5));
				functionColumn.setDataType(functionColumnsResultSet.getInt(6));
				functionColumn.setTypeName(functionColumnsResultSet.getString(7));
				functionColumn.setPrecision(functionColumnsResultSet.getInt(8));
				functionColumn.setLength(functionColumnsResultSet.getInt(9));
				functionColumn.setScale(functionColumnsResultSet.getShort(10));
				functionColumn.setRadix(functionColumnsResultSet.getShort(11));
				functionColumn.setNullable(functionColumnsResultSet.getShort(12));
				databaseDetails.addToFunctionColumns(functionColumn);
			}
			
			ResultSet procedureColumnsResultSet = metadata.getProcedureColumns(null, null, null, null);
			while(procedureColumnsResultSet.next()) {
				ProcedureColumn procedureColumn = new ProcedureColumn();
				procedureColumn.setProcedureCatalog(procedureColumnsResultSet.getString(1));
				procedureColumn.setProcedureSchema(procedureColumnsResultSet.getString(2));
				procedureColumn.setProcedureName(procedureColumnsResultSet.getString(3));
				procedureColumn.setColumnName(procedureColumnsResultSet.getString(4));
				procedureColumn.setColumnType(procedureColumnsResultSet.getShort(5));
				procedureColumn.setDataType(procedureColumnsResultSet.getInt(6));
				procedureColumn.setTypeName(procedureColumnsResultSet.getString(7));
				procedureColumn.setPrecission(procedureColumnsResultSet.getInt(8));
				procedureColumn.setLength(procedureColumnsResultSet.getInt(9));
				procedureColumn.setScale(procedureColumnsResultSet.getShort(10));
				procedureColumn.setRadix(procedureColumnsResultSet.getShort(11));
				procedureColumn.setNullable(procedureColumnsResultSet.getShort(12));
				procedureColumn.setRemarks(procedureColumnsResultSet.getString(13));
				procedureColumn.setColumnDefaultValue(procedureColumnsResultSet.getString(14));
				procedureColumn.setCharOctetLength(procedureColumnsResultSet.getInt(17));
				procedureColumn.setOrdinalPosition(procedureColumnsResultSet.getInt(18));
				procedureColumn.setIsNullable(procedureColumnsResultSet.getString(19));
				procedureColumn.setSpecificName(procedureColumnsResultSet.getString(20));
				databaseDetails.addToProcedureColumns(procedureColumn);
			}
			
			ResultSet versionColumnsResultSet = metadata.getVersionColumns(null, null, null);
			while(versionColumnsResultSet.next()) {
				VersionColumn versionColumn = new VersionColumn();
				versionColumn.setScope(versionColumnsResultSet.getShort(1));
				versionColumn.setColumnName(versionColumnsResultSet.getString(2));
				versionColumn.setDataType(versionColumnsResultSet.getInt(3));
				versionColumn.setTypeName(versionColumnsResultSet.getString(4));
				versionColumn.setColumnSize(versionColumnsResultSet.getInt(5));
				versionColumn.setBufferLength(versionColumnsResultSet.getInt(6));
				versionColumn.setDecimalDigits(versionColumnsResultSet.getInt(7));
				versionColumn.setPseudoColumn(versionColumnsResultSet.getShort(8));
				databaseDetails.addToVersionColumns(versionColumn);
			}

			ResultSet importedKeysResultSet = metadata.getImportedKeys(null, null, null);
			while(importedKeysResultSet.next()) {
				ImportedKey importedKey = new ImportedKey();
				importedKey.setPrimaryKeyTableCatalog(importedKeysResultSet.getString(1));
				importedKey.setPrimaryKeyTableSchema(importedKeysResultSet.getString(2));
				importedKey.setPrimaryKeyTableName(importedKeysResultSet.getString(3));
				importedKey.setPrimaryKeyColumnName(importedKeysResultSet.getString(4));
				importedKey.setForeignKeyTableCatalog(importedKeysResultSet.getString(5));
				importedKey.setForeignKeyTableSchema(importedKeysResultSet.getString(6));
				importedKey.setForeignKeyTableName(importedKeysResultSet.getString(7));
				importedKey.setForeignKeyColumnName(importedKeysResultSet.getString(8));
				importedKey.setKeySequenceNumber(importedKeysResultSet.getShort(9));
				importedKey.setUpdateRule(importedKeysResultSet.getShort(10));
				importedKey.setDeleteRule(importedKeysResultSet.getShort(11));
				importedKey.setForeignKeyName(importedKeysResultSet.getString(12));
				importedKey.setPrimaryKeyName(importedKeysResultSet.getString(13));
				importedKey.setDeferrability(importedKeysResultSet.getShort(14));
				databaseDetails.addToImportedKeys(importedKey);
			}

			ResultSet exportedKeysResultSet = metadata.getExportedKeys(null, null, null);
			while(exportedKeysResultSet.next()) {
				ExportedKey exportedKey = new ExportedKey();
				exportedKey.setPrimaryKeyTableCatalog(exportedKeysResultSet.getString(1));
				exportedKey.setPrimaryKeyTableSchema(exportedKeysResultSet.getString(2));
				exportedKey.setPrimaryKeyTableName(exportedKeysResultSet.getString(3));
				exportedKey.setPrimaryKeyColumnName(exportedKeysResultSet.getString(4));
				exportedKey.setForeignKeyTableCatalog(exportedKeysResultSet.getString(5));
				exportedKey.setForeignKeyTableSchema(exportedKeysResultSet.getString(6));
				exportedKey.setForeignKeyTableName(exportedKeysResultSet.getString(7));
				exportedKey.setForeignKeyColumnName(exportedKeysResultSet.getString(8));
				exportedKey.setKeySequenceNumber(exportedKeysResultSet.getShort(9));
				exportedKey.setUpdateRule(exportedKeysResultSet.getShort(10));
				exportedKey.setDeleteRule(exportedKeysResultSet.getShort(11));
				exportedKey.setForeignKeyName(exportedKeysResultSet.getString(12));
				exportedKey.setPrimaryKeyName(exportedKeysResultSet.getString(13));
				exportedKey.setDeferrability(exportedKeysResultSet.getShort(14));
				databaseDetails.addToExportedKeys(exportedKey);
			}
			
			ResultSet functionsResultSet = metadata.getFunctions(null, null, null);
			while(functionsResultSet.next()) {
				Function function = new Function();
				function.setFunctionCatalog(functionsResultSet.getString(1));
				function.setFunctionSchema(functionsResultSet.getString(2));
				function.setFunctionName(functionsResultSet.getString(3));
				function.setRemarks(functionsResultSet.getString(4));
				function.setFunctionType(functionsResultSet.getShort(5));
				function.setSpecificName(functionsResultSet.getString(6));
				databaseDetails.addToFunctions(function);
			}

			ResultSet userDefinedTypesResultSet = metadata.getUDTs(null, null, null, null);
			while(userDefinedTypesResultSet.next()) {
				UserDefinedType userDefinedType = new UserDefinedType();
				userDefinedType.setTypeCatalog(userDefinedTypesResultSet.getString(1));
				userDefinedType.setTypeSchema(userDefinedTypesResultSet.getString(2));
				userDefinedType.setTypeName(userDefinedTypesResultSet.getString(3));
				userDefinedType.setClassName(userDefinedTypesResultSet.getString(4));
				userDefinedType.setDataType(userDefinedTypesResultSet.getInt(5));
				userDefinedType.setRemarks(userDefinedTypesResultSet.getString(6));
				userDefinedType.setBaseType(userDefinedTypesResultSet.getShort(7));
				databaseDetails.addToUserDefinedTypes(userDefinedType);
			}

			ResultSet bestRowIdentifierResultSet = metadata.getBestRowIdentifier(null, null, null, 2, true);
			while(bestRowIdentifierResultSet.next()) {
				BestRowIdentifier bestRowIdentifier = new BestRowIdentifier();
				bestRowIdentifier.setScope(bestRowIdentifierResultSet.getShort(1));
				bestRowIdentifier.setColumnName(bestRowIdentifierResultSet.getString(2));
				bestRowIdentifier.setDataType(bestRowIdentifierResultSet.getInt(3));
				bestRowIdentifier.setTypeName(bestRowIdentifierResultSet.getString(4));
				bestRowIdentifier.setColumnSize(bestRowIdentifierResultSet.getInt(5));
				bestRowIdentifier.setDecimalDigits(bestRowIdentifierResultSet.getShort(7));
				bestRowIdentifier.setPseudoColumn(bestRowIdentifierResultSet.getShort(8));
				databaseDetails.addToBestRowIdentifiers(bestRowIdentifier);
			}
			
			ResultSet crossReferenceResultSet = metadata.getCrossReference(null, null, null, null, null, null);
			while(crossReferenceResultSet.next()) {
				CrossReference crossReference = new CrossReference();
				crossReference.setParentKeyTableCatalog(crossReferenceResultSet.getString(1));
				crossReference.setParentKeyTableSchema(crossReferenceResultSet.getString(2));
				crossReference.setParentKeyTableName(crossReferenceResultSet.getString(3));
				crossReference.setParentKeyTableColumnName(crossReferenceResultSet.getString(4));
				crossReference.setForeignKeyTableCatalog(crossReferenceResultSet.getString(5));
				crossReference.setForeignKeyTableSchema(crossReferenceResultSet.getString(6));
				crossReference.setForeignKeyTableName(crossReferenceResultSet.getString(7));
				crossReference.setForeignKeyColumnName(crossReferenceResultSet.getString(8));
				crossReference.setSequenceNumber(crossReferenceResultSet.getShort(9));
				crossReference.setUpdateRule(crossReferenceResultSet.getShort(10));
				crossReference.setDeleteRule(crossReferenceResultSet.getShort(11));
				crossReference.setForeignKeyName(crossReferenceResultSet.getString(12));
				crossReference.setParentKeyName(crossReferenceResultSet.getString(13));
				crossReference.setDeferrability(crossReferenceResultSet.getShort(14));
				databaseDetails.addToCrossReferences(crossReference);
			}

			ResultSet primaryKeysResultSet = metadata.getPrimaryKeys(null, null, null);
			while(primaryKeysResultSet.next()) {
				PrimaryKey primaryKey = new PrimaryKey();
				primaryKey.setTableCatalog(primaryKeysResultSet.getString(1));
				primaryKey.setTableSchema(primaryKeysResultSet.getString(2));
				primaryKey.setTableName(primaryKeysResultSet.getString(3));
				primaryKey.setColumnName(primaryKeysResultSet.getString(4));
				primaryKey.setKeySequence(primaryKeysResultSet.getShort(5));
				primaryKey.setPrimaryKeyName(primaryKeysResultSet.getString(6));
				databaseDetails.addToPrimaryKeys(primaryKey);
			}

			ResultSet indexInfosResultSet = metadata.getIndexInfo(null, null, null, false, false);
			while(indexInfosResultSet.next()) {
				IndexInfo indexInfo = new IndexInfo();
				indexInfo.setTableCatalog(indexInfosResultSet.getString(1));
				indexInfo.setTableSchema(indexInfosResultSet.getString(2));
				indexInfo.setTableName(indexInfosResultSet.getString(3));
				indexInfo.setNonUnique(indexInfosResultSet.getBoolean(4));
				indexInfo.setIndexQualifier(indexInfosResultSet.getString(5));
				indexInfo.setIndexName(indexInfosResultSet.getString(6));
				indexInfo.setType(indexInfosResultSet.getShort(7));
				indexInfo.setOrdinalPosition(indexInfosResultSet.getShort(8));
				indexInfo.setColumnName(indexInfosResultSet.getString(9));
				indexInfo.setAscendingOrDescending(indexInfosResultSet.getString(10));
				indexInfo.setCardinality(indexInfosResultSet.getLong(11));
				indexInfo.setPages(indexInfosResultSet.getLong(12));
				indexInfo.setFilterCondition(indexInfosResultSet.getString(13));
				databaseDetails.addToIndexInfos(indexInfo);
			}
 
			ResultSet proceduresResultSet = metadata.getProcedures(null, null, null);
			while(proceduresResultSet.next()) {
				Procedure procedure = new Procedure();
				procedure.setProcedureCatalog(proceduresResultSet.getString(1)); 
				procedure.setProcedureSchema(proceduresResultSet.getString(2));
				procedure.setProcedureName(proceduresResultSet.getString(3));
				procedure.setRemarks(proceduresResultSet.getString(7));
				procedure.setProcedureType(proceduresResultSet.getShort(8));
				procedure.setSpecificName(proceduresResultSet.getString(9));
				databaseDetails.addToProcedures(procedure);
			}
			
			ResultSet superTablesResultSet = metadata.getSuperTables(null, null, null);
			while(superTablesResultSet.next()) {
				SuperTable superTable = new SuperTable();
				superTable.setTableCatalog(superTablesResultSet.getString(1));
				superTable.setTableSchema(superTablesResultSet.getString(2));
				superTable.setTableName(superTablesResultSet.getString(3));
				superTable.setSuperTableName(superTablesResultSet.getString(4));
				databaseDetails.addToSuperTables(superTable);
			}
			
			ResultSet superTypesResultSet = metadata.getSuperTypes(null, null, null);
			while(superTypesResultSet.next()) {
				SuperType superType = new SuperType();
				superType.setTypeCatalog(superTypesResultSet.getString(1));
				superType.setTypeSchema(superTypesResultSet.getString(2));
				superType.setSuperTypeCatalog(superTypesResultSet.getString(3));
				superType.setSuperTypeSchema(superTypesResultSet.getString(4));
				superType.setSuperTypeName(superTypesResultSet.getString(5));
				databaseDetails.addToSuperTypes(superType);
			}
						
			connection.close();
			return new ResponseEntity<>("{\"result\": \"SUCCESS\"}", HttpStatus.OK);
		} catch(Exception e) {
			LOGGER.error(e.getMessage(), e);
			return new ResponseEntity<>(new StringBuilder("{\"result\": \"").append(e.getMessage()).append("\"}").toString(), HttpStatus.NOT_FOUND);
		} 
	}	
}
