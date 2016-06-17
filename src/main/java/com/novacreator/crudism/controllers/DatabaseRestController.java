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
	
	class ClientInfo {
		private String name;
		private int maxLength;
		private String defaultValue;
		private String description;
	}
	
	class DatabaseDetails {
		String currentCatalog;
		Map<String, String> clientInfo = new HashMap<>();
		String schema;
		String identifierQuote;
		Set<String> catalogs = new HashSet<>();
		String catalogSeparator;
		String catalogTerm;
		Set<ClientInfo> metadataClientInfo = new HashSet<>();
		int databaseMajorVersion;
		int databaseMinorVersion;
		public String databaseProductName;
		public String databaseProductVersion;
		public int defaultTransactionIsolation;
		public int driverMajorVersion;
		public int driverMinorVersion;
		public String driverName;
		public String driverVersion;
		public int jdbcMajorVersion;
		public int jdbcMinorVersion;
		public int maxBinaryLiteralLength;
		public int maxCatalogNameLength;
		public int maxCharLiteralLength;
		public int maxColumnNameLength;
		public int maxColumnsInGroupBy;
		public int maxColumnsInIndex;
		public int maxColumnsInOrderBy;
		public int maxColumnsInSelect;
		public int maxConnections;
		public int maxColumnsInTable;
		public int maxCursorNameLength;
		public int maxIndexLength;
		public long maxLogicalLobSize;
		public int maxProcedureNameLength;
		public int maxRowSize;
		public int maxSchemaNameLength;
		public int maxStatementLength;
		public int maxStatements;
		public int maxTableNameLength;
		public int maxTablesInSelect;
		public int maxUserNameLength;
		Set<String> numericFunctions = new HashSet<>();
		Set<String> sqlKeywords = new HashSet<>();
		public String procedureTerm;
		Set<SchemaDetails> schemas = new HashSet<>();
		public String schemaTerm;
		public String searchStringEscape;
		Set<String> stringFunctions = new HashSet<>();
		Set<String> systemFunctions = new HashSet<>();
		Set<String> timeDateFunctions = new HashSet<>();
		Set<String> tableTypes = new HashSet<>();
		Set<TypeInfo> typeInfos = new HashSet<>();
		String url;
		String userName;
		Set<TableDetails> tableDetails = new HashSet<>();
		Set<Attribute> attributes = new HashSet<>();
		Set<Column> columns = new HashSet<>();
		Set<ColumnPrivilege> columnPrivileges = new HashSet<>();
		Set<TablePrivilege> tablePrivileges = new HashSet<>();
		Set<PseudoColumn> pseudoColumns = new HashSet<>();
		Set<FunctionColumn> functionColumns = new HashSet<>();
		Set<ProcedureColumn> procedureColumns = new HashSet<>();
		Set<VersionColumn> versionColumns = new HashSet<>();
		Set<ImportedKey> importedKeys = new HashSet<>();
		Set<ExportedKey> exportedKeys = new HashSet<>();
		Set<Function> functions = new HashSet<>();
		Set<UserDefinedType> userDefinedTypes = new HashSet<>();
	}
	
	class TypeInfo {
		String typeName;
		String dataType;
		int precission;
		String literalPrefix;
		String literalSuffix;
		String createParams;
		short nullable;
		boolean caseSensitive;
		boolean searchable;
		boolean unsignedAttribute;
		boolean fixedPrecissionScale;
		boolean autoIncrement;
		String localTypeName;
		short minimumScale;
		short maximumScale;
		int numberPrecissionRadix;
	}
	
	class SchemaDetails {
		String schemaName;
		String catalogName;
	}
	
	class TableDetails {
		String catalog;
		String schema;
		String name;
		String type;
		String remarks;
		String typeCatalog;
		String typeSchema;
		String typeName;
		String selfReferencingColumnName;
		String referenceGeneration;		
	}
	
	class Attribute {
		String typeCatalog;
		String typeSchema;
		String typeName;
		String attributeName;
		int dataType;
		String attributeTypeName;
		int attributeSize;
		int decimalDigits;
		int numberPrecissionRadix;
		int nullable;
		String remarks;
		String attributeDefinition;
		int charOctetLength;
		int ordinalPosition;
		String isNullable;
		String scopeCatalog;
		String scopeSchema;
		String scopeTable;
		short sourceDataType;		
	}
	
	class TablePrivilege {
		public String tableCatalog;
		public String tableSchema;
		public String tableName;
		public String grantor;
		public String grantee;
		public String privilege;
		public String isGrantable;
	}
	
	class Column {
		public String tableCatalog;
		public String tableSchema;
		public String tableName;
		public String name;
		public int dataType;
		public String typeName;
		public int columnSize;
		public int decimalDigits;
		public int numberPrecissionRadix;
		public int nullable;
		public String remarks;
		public String columnDefinition;
		public int charOctetLength;
		public int ordinalPosition;
		public String isNullable;
		public String scopeCatalog;
		public String scopeSchema;
		public String scopeTable;
		public short sourceDataType;
		public String isAutoincrement;
		public String isGeneratedColumn;
	}
	
	class Function {

		public String functionCatalog;
		public String functionSchema;
		public String functionName;
		public String remarks;
		public short functionType;
		public String specificName;}
	
	class FunctionColumn {
		public String functionCatalog;
		public String functionSchema;
		public String functionName;
		public String columnName;
		public short columnType;
		public int dataType;
		public String typeName;
		public int precision;
		public int length;
		public short scale;
		public short radix;
		public short nullable;
	}
	
	class ProcedureColumn {
		public String procedureCatalog;
		public String procedureSchema;
		public String procedureName;
		public String columnName;
		public short columnType;
		public int dataType;
		public String typeName;
		public int precission;
		public int length;
		public short scale;
		public short radix;
		public short nullable;
		public String remarks;
		public String columnDefaultValue;
		public int charOctetLength;
		public int ordinalPosition;
		public String isNullable;
		public String specificName;
	}
	
	class VersionColumn {
		public short scope;
		public String columnName;
		public int dataType;
		public String typeName;
		public int columnSize;
		public int bufferLength;
		public int decimalDigits;
		public short pseudoColumn;
	}
	
	class ColumnPrivilege {
		public String tableCatalog;
		public String tableSchema;
		public String tableName;
		public String columnName;
		public String grantor;
		public String grantee;
		public String privilege;
		public String isGrantable;
	}
	
	class PseudoColumn {
		public String tableCatalog;
		public String tableSchema;
		public String tableName;
		public String columnName;
		public int dataType;
		public int columnSize;
		public int decimalDigits;
		public int numberPrecissionRadix;
		public String columnUsage;
		public String remarks;
		public int charOctetLength;
		public String isNullable;
	}
	
	class ImportedKey {
		public String primaryKeyTableCatalog;
		public String primaryKeyTableSchema;
		public String primaryKeyTableName;
		public String primaryKeyColumnName;
		public String foreignKeyTableCatalog;
		public String foreignKeyTableSchema;
		public String foreignKeyTableName;
		public String foreignKeyColumnName;
		public short keySequenceNumber;
		public short updateRule;
		public short deleteRule;
		public String foreignKeyName;
		public String primaryKeyName;
		public short deferrability;
	}
	
	class ExportedKey {
		public String primaryKeyTableCatalog;
		public String primaryKeyTableSchema;
		public String primaryKeyTableName;
		public String primaryKeyColumnName;
		public String foreignKeyTableCatalog;
		public String foreignKeyTableSchema;
		public String foreignKeyTableName;
		public String foreignKeyColumnName;
		public short keySequenceNumber;
		public short updateRule;
		public short deleteRule;
		public String foreignKeyName;
		public String primaryKeyName;
		public short deferrability;
	}
	
	class UserDefinedType {

		public String typeCatalog;
		public String typeSchema;
		public String typeName;
		public String classNmae;
		public int dataType;
		public short baseType;
		public String remarks;
		
	}
	
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
				clientInfo.name = clientInfoPropertiesResultSet.getString(1);
				clientInfo.maxLength = clientInfoPropertiesResultSet.getInt(1);
				clientInfo.defaultValue = clientInfoPropertiesResultSet.getString(2);
				clientInfo.description = clientInfoPropertiesResultSet.getString(3);
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
				schemaDetails.schemaName = schemasResultSet.getString(1);
				schemaDetails.catalogName = schemasResultSet.getString(2);
				databaseDetails.schemas.add(schemaDetails);
			}
			ResultSet schemaInfoResultSet = metadata.getSchemas(null, null);
			while(schemaInfoResultSet.next()) {
				SchemaDetails schemaDetails = new SchemaDetails();
				schemaDetails.schemaName = schemasResultSet.getString(1);
				schemaDetails.catalogName = schemasResultSet.getString(2);
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
				tableDetails.catalog = tablesResultSet.getString(1);
				tableDetails.schema = tablesResultSet.getString(2);
				tableDetails.name = tablesResultSet.getString(3);
				tableDetails.type = tablesResultSet.getString(4);
				tableDetails.remarks = tablesResultSet.getString(5);
				tableDetails.typeCatalog = tablesResultSet.getString(6);
				tableDetails.typeSchema = tablesResultSet.getString(7);
				tableDetails.typeName = tablesResultSet.getString(8);
				tableDetails.selfReferencingColumnName = tablesResultSet.getString(9);
				tableDetails.referenceGeneration = tablesResultSet.getString(10);
				databaseDetails.tableDetails.add(tableDetails);
			}
			ResultSet attributesResultSet = metadata.getAttributes(null, null, null, null);
			while(attributesResultSet.next()) {
				Attribute attribute = new Attribute();
				attribute.typeSchema = attributesResultSet.getString(1);
				attribute.typeCatalog = attributesResultSet.getString(2);
				attribute.typeName =  attributesResultSet.getString(3);
				attribute.attributeName = attributesResultSet.getString(4);
				attribute.dataType = attributesResultSet.getInt(5);
				attribute.attributeTypeName = attributesResultSet.getString(6);
				attribute.attributeSize = attributesResultSet.getInt(7);
				attribute.decimalDigits = attributesResultSet.getInt(8);
				attribute.numberPrecissionRadix = attributesResultSet.getInt(9);
				attribute.nullable = attributesResultSet.getInt(10);
				attribute.remarks = attributesResultSet.getString(11);
				attribute.attributeDefinition = attributesResultSet.getString(12);
				attribute.charOctetLength = attributesResultSet.getInt(15);
				attribute.ordinalPosition = attributesResultSet.getInt(16);
				attribute.isNullable = attributesResultSet.getString(17);
				attribute.scopeCatalog = attributesResultSet.getString(18);
				attribute.scopeSchema = attributesResultSet.getString(19);
				attribute.scopeTable = attributesResultSet.getString(20);
				attribute.sourceDataType = attributesResultSet.getShort(21);
				databaseDetails.attributes.add(attribute);
			}
			
			ResultSet columnsResultSet = metadata.getColumns(null, null, null, null);
			while(columnsResultSet.next()) {
				Column column = new Column();
				column.tableCatalog = columnsResultSet.getString(1);
				column.tableSchema = columnsResultSet.getString(2);
				column.tableName = columnsResultSet.getString(3);
				column.name = columnsResultSet.getString(4);
				column.dataType = columnsResultSet.getInt(5);
				column.typeName = columnsResultSet.getString(6);
				column.columnSize = columnsResultSet.getInt(7);
				column.decimalDigits = columnsResultSet.getInt(9);
				column.numberPrecissionRadix = columnsResultSet.getInt(10);
				column.nullable = columnsResultSet.getInt(11);
				column.remarks = columnsResultSet.getString(12);
				column.columnDefinition = columnsResultSet.getString(13);
				column.charOctetLength = columnsResultSet.getInt(16);
				column.ordinalPosition = columnsResultSet.getInt(17);
				column.isNullable = columnsResultSet.getString(18);
				column.scopeCatalog = columnsResultSet.getString(19);
				column.scopeSchema = columnsResultSet.getString(20);
				column.scopeTable = columnsResultSet.getString(21);
				column.sourceDataType = columnsResultSet.getShort(22);
				column.isAutoincrement = columnsResultSet.getString(23);
				column.isGeneratedColumn = columnsResultSet.getString(24);
				databaseDetails.columns.add(column);
			}
			
			ResultSet tablePrivilegesResultSet = metadata.getTablePrivileges(null, null, null);
			while(tablePrivilegesResultSet.next()) {
				TablePrivilege tablePrivilege = new TablePrivilege();
				tablePrivilege.tableCatalog = tablePrivilegesResultSet.getString(1);
				tablePrivilege.tableSchema = tablePrivilegesResultSet.getString(2);
				tablePrivilege.tableName = tablePrivilegesResultSet.getString(3);
				tablePrivilege.grantor = tablePrivilegesResultSet.getString(5);
				tablePrivilege.grantee = tablePrivilegesResultSet.getString(6);
				tablePrivilege.privilege = tablePrivilegesResultSet.getString(7);
				tablePrivilege.isGrantable = tablePrivilegesResultSet.getString(8);
				databaseDetails.tablePrivileges.add(tablePrivilege);				
			}
			
			ResultSet columnPrivilegesResultSet = metadata.getColumnPrivileges(null, null, null, null);
			while(columnPrivilegesResultSet.next()) {
				ColumnPrivilege columnPrivilege = new ColumnPrivilege();
				columnPrivilege.tableCatalog = columnPrivilegesResultSet.getString(1);
				columnPrivilege.tableSchema = columnPrivilegesResultSet.getString(2);
				columnPrivilege.tableName = columnPrivilegesResultSet.getString(3);
				columnPrivilege.columnName = columnPrivilegesResultSet.getString(4);
				columnPrivilege.grantor = columnPrivilegesResultSet.getString(5);
				columnPrivilege.grantee = columnPrivilegesResultSet.getString(6);
				columnPrivilege.privilege = columnPrivilegesResultSet.getString(7);
				columnPrivilege.isGrantable = columnPrivilegesResultSet.getString(8);
				databaseDetails.columnPrivileges.add(columnPrivilege);
			}
			
			ResultSet pseudoColumnsResultSet = metadata.getPseudoColumns(null, null, null, null);
			while(pseudoColumnsResultSet.next()) {
				PseudoColumn pseudoColumn = new PseudoColumn();
				pseudoColumn.tableCatalog = pseudoColumnsResultSet.getString(1);
				pseudoColumn.tableSchema = pseudoColumnsResultSet.getString(2);
				pseudoColumn.tableName = pseudoColumnsResultSet.getString(3);
				pseudoColumn.columnName = pseudoColumnsResultSet.getString(4);
				pseudoColumn.dataType = pseudoColumnsResultSet.getInt(5);
				pseudoColumn.columnSize = pseudoColumnsResultSet.getInt(6);
				pseudoColumn.decimalDigits = pseudoColumnsResultSet.getInt(7);
				pseudoColumn.numberPrecissionRadix = pseudoColumnsResultSet.getInt(8);
				pseudoColumn.columnUsage = pseudoColumnsResultSet.getString(9);
				pseudoColumn.remarks = pseudoColumnsResultSet.getString(10);
				pseudoColumn.charOctetLength = pseudoColumnsResultSet.getInt(11);
				pseudoColumn.isNullable = pseudoColumnsResultSet.getString(12);
				databaseDetails.pseudoColumns.add(pseudoColumn);
			}
			
			ResultSet functionColumnsResultSet = metadata.getFunctionColumns(null, null, null, null);
			while(functionColumnsResultSet.next()) {
				FunctionColumn functionColumn = new FunctionColumn();
				functionColumn.functionCatalog = functionColumnsResultSet.getString(1);
				functionColumn.functionSchema = functionColumnsResultSet.getString(2);
				functionColumn.functionName = functionColumnsResultSet.getString(3);
				functionColumn.columnName = functionColumnsResultSet.getString(4);
				functionColumn.columnType = functionColumnsResultSet.getShort(5);
				functionColumn.dataType = functionColumnsResultSet.getInt(6);
				functionColumn.typeName = functionColumnsResultSet.getString(7);
				functionColumn.precision = functionColumnsResultSet.getInt(8);
				functionColumn.length = functionColumnsResultSet.getInt(9);
				functionColumn.scale = functionColumnsResultSet.getShort(10);
				functionColumn.radix = functionColumnsResultSet.getShort(11);
				functionColumn.nullable = functionColumnsResultSet.getShort(12);
				databaseDetails.functionColumns.add(functionColumn);
			}
			
			ResultSet procedureColumnsResultSet = metadata.getProcedureColumns(null, null, null, null);
			while(procedureColumnsResultSet.next()) {
				ProcedureColumn procedureColumn = new ProcedureColumn();
				procedureColumn.procedureCatalog = procedureColumnsResultSet.getString(1);
				procedureColumn.procedureSchema = procedureColumnsResultSet.getString(2);
				procedureColumn.procedureName = procedureColumnsResultSet.getString(3);
				procedureColumn.columnName = procedureColumnsResultSet.getString(4);
				procedureColumn.columnType = procedureColumnsResultSet.getShort(5);
				procedureColumn.dataType = procedureColumnsResultSet.getInt(6);
				procedureColumn.typeName = procedureColumnsResultSet.getString(7);
				procedureColumn.precission = procedureColumnsResultSet.getInt(8);
				procedureColumn.length = procedureColumnsResultSet.getInt(9);
				procedureColumn.scale = procedureColumnsResultSet.getShort(10);
				procedureColumn.radix = procedureColumnsResultSet.getShort(11);
				procedureColumn.nullable = procedureColumnsResultSet.getShort(12);
				procedureColumn.remarks = procedureColumnsResultSet.getString(13);
				procedureColumn.columnDefaultValue = procedureColumnsResultSet.getString(14);
				procedureColumn.charOctetLength = procedureColumnsResultSet.getInt(17);
				procedureColumn.ordinalPosition = procedureColumnsResultSet.getInt(18);
				procedureColumn.isNullable = procedureColumnsResultSet.getString(19);
				procedureColumn.specificName = procedureColumnsResultSet.getString(20);
				databaseDetails.procedureColumns.add(procedureColumn);
			}
			
			ResultSet versionColumnsResultSet = metadata.getVersionColumns(null, null, null);
			while(versionColumnsResultSet.next()) {
				VersionColumn versionColumn = new VersionColumn();
				versionColumn.scope = versionColumnsResultSet.getShort(1);
				versionColumn.columnName = versionColumnsResultSet.getString(2);
				versionColumn.dataType = versionColumnsResultSet.getInt(3);
				versionColumn.typeName = versionColumnsResultSet.getString(4);
				versionColumn.columnSize = versionColumnsResultSet.getInt(5);
				versionColumn.bufferLength = versionColumnsResultSet.getInt(6);
				versionColumn.decimalDigits = versionColumnsResultSet.getInt(7);
				versionColumn.pseudoColumn = versionColumnsResultSet.getShort(8);
				databaseDetails.versionColumns.add(versionColumn);
			}

			ResultSet importedKeysResultSet = metadata.getImportedKeys(null, null, null);
			while(importedKeysResultSet.next()) {
				ImportedKey importedKey = new ImportedKey();
				importedKey.primaryKeyTableCatalog = importedKeysResultSet.getString(1);
				importedKey.primaryKeyTableSchema = importedKeysResultSet.getString(2);
				importedKey.primaryKeyTableName = importedKeysResultSet.getString(3);
				importedKey.primaryKeyColumnName = importedKeysResultSet.getString(4);
				importedKey.foreignKeyTableCatalog = importedKeysResultSet.getString(5);
				importedKey.foreignKeyTableSchema = importedKeysResultSet.getString(6);
				importedKey.foreignKeyTableName = importedKeysResultSet.getString(7);
				importedKey.foreignKeyColumnName = importedKeysResultSet.getString(8);
				importedKey.keySequenceNumber = importedKeysResultSet.getShort(9);
				importedKey.updateRule = importedKeysResultSet.getShort(10);
				importedKey.deleteRule = importedKeysResultSet.getShort(11);
				importedKey.foreignKeyName = importedKeysResultSet.getString(12);
				importedKey.primaryKeyName = importedKeysResultSet.getString(13);
				importedKey.deferrability = importedKeysResultSet.getShort(14);
				databaseDetails.importedKeys.add(importedKey);
			}

			ResultSet exportedKeysResultSet = metadata.getExportedKeys(null, null, null);
			while(exportedKeysResultSet.next()) {
				ExportedKey exportedKey = new ExportedKey();
				exportedKey.primaryKeyTableCatalog = exportedKeysResultSet.getString(1);
				exportedKey.primaryKeyTableSchema = exportedKeysResultSet.getString(2);
				exportedKey.primaryKeyTableName = exportedKeysResultSet.getString(3);
				exportedKey.primaryKeyColumnName = exportedKeysResultSet.getString(4);
				exportedKey.foreignKeyTableCatalog = exportedKeysResultSet.getString(5);
				exportedKey.foreignKeyTableSchema = exportedKeysResultSet.getString(6);
				exportedKey.foreignKeyTableName = exportedKeysResultSet.getString(7);
				exportedKey.foreignKeyColumnName = exportedKeysResultSet.getString(8);
				exportedKey.keySequenceNumber = exportedKeysResultSet.getShort(9);
				exportedKey.updateRule = exportedKeysResultSet.getShort(10);
				exportedKey.deleteRule = exportedKeysResultSet.getShort(11);
				exportedKey.foreignKeyName = exportedKeysResultSet.getString(12);
				exportedKey.primaryKeyName = exportedKeysResultSet.getString(13);
				exportedKey.deferrability = exportedKeysResultSet.getShort(14);
				databaseDetails.exportedKeys.add(exportedKey);
			}
			
			ResultSet functionsResultSet = metadata.getFunctions(null, null, null);
			while(functionsResultSet.next()) {
				Function function = new Function();
				function.functionCatalog = functionsResultSet.getString(1);
				function.functionSchema = functionsResultSet.getString(2);
				function.functionName = functionsResultSet.getString(3);
				function.remarks = functionsResultSet.getString(4);
				function.functionType = functionsResultSet.getShort(5);
				function.specificName = functionsResultSet.getString(6);
				databaseDetails.functions.add(function);
			}


			ResultSet userDefinedTypesResultSet = metadata.getUDTs(null, null, null, null);
			while(userDefinedTypesResultSet.next()) {
				UserDefinedType userDefinedType = new UserDefinedType();
				userDefinedType.typeCatalog = userDefinedTypesResultSet.getString(1);
				userDefinedType.typeSchema = userDefinedTypesResultSet.getString(2);
				userDefinedType.typeName = userDefinedTypesResultSet.getString(3);
				userDefinedType.classNmae = userDefinedTypesResultSet.getString(4);
				userDefinedType.dataType = userDefinedTypesResultSet.getInt(5);
				userDefinedType.remarks = userDefinedTypesResultSet.getString(6);
				userDefinedType.baseType = userDefinedTypesResultSet.getShort(7);
				databaseDetails.userDefinedTypes.add(userDefinedType);
			}
			
			//metadata.getBestRowIdentifier(catalog, schema, table, scope, nullable);
			//metadata.getCrossReference(parentCatalog, parentSchema, parentTable, foreignCatalog, foreignSchema, foreignTable)
			//metadata.getPrimaryKeys(catalog, schema, table);
			//metadata.getIndexInfo(catalog, schema, table, unique, approximate);
			//metadata.getProcedures(catalog, schemaPattern, procedureNamePattern);
			//metadata.getSuperTables(catalog, schemaPattern, tableNamePattern)
			//metadata.getSuperTypes(catalog, schemaPattern, typeNamePattern)
						
			connection.close();
			return new ResponseEntity<>("{\"result\": \"SUCCESS\"}", HttpStatus.OK);
		} catch(Exception e) {
			LOGGER.error(e.getMessage(), e);
			return new ResponseEntity<>(new StringBuilder("{\"result\": \"").append(e.getMessage()).append("\"}").toString(), HttpStatus.NOT_FOUND);
		} 
	}
	
}
