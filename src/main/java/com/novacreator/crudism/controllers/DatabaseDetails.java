package com.novacreator.crudism.controllers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DatabaseDetails {
	private String currentCatalog;
	private Map<String, String> clientInfo = new HashMap<>();
	private String schema;
	private String identifierQuote;
	private Set<String> catalogs = new HashSet<>();
	private String catalogSeparator;
	private String catalogTerm;
	private Set<ClientInfo> metadataClientInfos = new HashSet<>();
	private int databaseMajorVersion;
	private int databaseMinorVersion;
	private String databaseProductName;
	private String databaseProductVersion;
	private int defaultTransactionIsolation;
	private int driverMajorVersion;
	private int driverMinorVersion;
	private String driverName;
	private String driverVersion;
	private int jdbcMajorVersion;
	private int jdbcMinorVersion;
	private int maxBinaryLiteralLength;
	private int maxCatalogNameLength;
	private int maxCharLiteralLength;
	private int maxColumnNameLength;
	private int maxColumnsInGroupBy;
	private int maxColumnsInIndex;
	private int maxColumnsInOrderBy;
	private int maxColumnsInSelect;
	private int maxConnections;
	private int maxColumnsInTable;
	private int maxCursorNameLength;
	private int maxIndexLength;
	private long maxLogicalLobSize;
	private int maxProcedureNameLength;
	private int maxRowSize;
	private int maxSchemaNameLength;
	private int maxStatementLength;
	private int maxStatements;
	private int maxTableNameLength;
	private int maxTablesInSelect;
	private int maxUserNameLength;
	private Set<String> numericFunctions = new HashSet<>();
	private Set<String> sqlKeywords = new HashSet<>();
	private String procedureTerm;
	private Set<SchemaDetails> schemas = new HashSet<>();
	private String schemaTerm;
	private String searchStringEscape;
	private Set<String> stringFunctions = new HashSet<>();
	private Set<String> systemFunctions = new HashSet<>();
	private Set<String> timeDateFunctions = new HashSet<>();
	private Set<String> tableTypes = new HashSet<>();
	private Set<TypeInfo> typeInfos = new HashSet<>();
	private String url;
	private String userName;
	private Set<TableDetails> tableDetails = new HashSet<>();
	private Set<Attribute> attributes = new HashSet<>();
	private Set<Column> columns = new HashSet<>();
	private Set<ColumnPrivilege> columnPrivileges = new HashSet<>();
	private Set<TablePrivilege> tablePrivileges = new HashSet<>();
	private Set<PseudoColumn> pseudoColumns = new HashSet<>();
	private Set<FunctionColumn> functionColumns = new HashSet<>();
	private Set<ProcedureColumn> procedureColumns = new HashSet<>();
	private Set<VersionColumn> versionColumns = new HashSet<>();
	private Set<ImportedKey> importedKeys = new HashSet<>();
	private Set<ExportedKey> exportedKeys = new HashSet<>();
	private Set<Function> functions = new HashSet<>();
	private Set<UserDefinedType> userDefinedTypes = new HashSet<>();
	private Set<BestRowIdentifier> bestRowIdentifiers = new HashSet<>();
	private Set<CrossReference> crossReferences = new HashSet<>();
	private Set<PrimaryKey> primaryKeys = new HashSet<>();
	private Set<IndexInfo> indexInfos = new HashSet<>();
	private Set<Procedure> procedures = new HashSet<>();
	private Set<SuperTable> superTables = new HashSet<>();
	private Set<SuperType> superTypes = new HashSet<>();
	
	public String getCurrentCatalog() {
		return currentCatalog;
	}
	public void setCurrentCatalog(String currentCatalog) {
		this.currentCatalog = currentCatalog;
	}
	
	public String getFromClientInfo(String key) {
		return clientInfo.get(key);
	}
	public void addToClientInfo(String key, String value) {
		clientInfo.put(key, value);
	}

	public String getSchema() {
		return schema;
	}
	public void setSchema(String schema) {
		this.schema = schema;
	}
	
	public String getIdentifierQuote() {
		return identifierQuote;
	}
	public void setIdentifierQuote(String identifierQuote) {
		this.identifierQuote = identifierQuote;
	}
	
	public Set<String> getCatalogs() {
		return catalogs;
	}
	public void addToCatalogs(String catalog) {
		catalogs.add(catalog);
	}

	public String getCatalogSeparator() {
		return catalogSeparator;
	}
	public void setCatalogSeparator(String catalogSeparator) {
		this.catalogSeparator = catalogSeparator;
	}
	
	public String getCatalogTerm() {
		return catalogTerm;
	}
	public void setCatalogTerm(String catalogTerm) {
		this.catalogTerm = catalogTerm;
	}
	
	public Set<ClientInfo> getMetadataClientInfos() {
		return metadataClientInfos;
	}
	public void setMetadataClientInfos(Set<ClientInfo> metadataClientInfos) {
		this.metadataClientInfos = metadataClientInfos;
	}
	
	public int getDatabaseMajorVersion() {
		return databaseMajorVersion;
	}
	public void setDatabaseMajorVersion(int databaseMajorVersion) {
		this.databaseMajorVersion = databaseMajorVersion;
	}
	
	public int getDatabaseMinorVersion() {
		return databaseMinorVersion;
	}
	public void setDatabaseMinorVersion(int databaseMinorVersion) {
		this.databaseMinorVersion = databaseMinorVersion;
	}
	
	public String getDatabaseProductName() {
		return databaseProductName;
	}
	
	public void setDatabaseProductName(String databaseProductName) {
		this.databaseProductName = databaseProductName;
	}
	public String getDatabaseProductVersion() {
		return databaseProductVersion;
	}
	
	public void setDatabaseProductVersion(String databaseProductVersion) {
		this.databaseProductVersion = databaseProductVersion;
	}
	public int getDefaultTransactionIsolation() {
		return defaultTransactionIsolation;
	}
	public void setDefaultTransactionIsolation(int defaultTransactionIsolation) {
		this.defaultTransactionIsolation = defaultTransactionIsolation;
	}
	
	public int getDriverMajorVersion() {
		return driverMajorVersion;
	}
	public void setDriverMajorVersion(int driverMajorVersion) {
		this.driverMajorVersion = driverMajorVersion;
	}
	
	public int getDriverMinorVersion() {
		return driverMinorVersion;
	}
	public void setDriverMinorVersion(int driverMinorVersion) {
		this.driverMinorVersion = driverMinorVersion;
	}
	
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	
	public String getDriverVersion() {
		return driverVersion;
	}
	public void setDriverVersion(String driverVersion) {
		this.driverVersion = driverVersion;
	}
	
	public int getJdbcMajorVersion() {
		return jdbcMajorVersion;
	}
	public void setJdbcMajorVersion(int jdbcMajorVersion) {
		this.jdbcMajorVersion = jdbcMajorVersion;
	}
	
	public int getJdbcMinorVersion() {
		return jdbcMinorVersion;
	}
	public void setJdbcMinorVersion(int jdbcMinorVersion) {
		this.jdbcMinorVersion = jdbcMinorVersion;
	}
	
	public int getMaxBinaryLiteralLength() {
		return maxBinaryLiteralLength;
	}
	public void setMaxBinaryLiteralLength(int maxBinaryLiteralLength) {
		this.maxBinaryLiteralLength = maxBinaryLiteralLength;
	}
	
	public int getMaxCatalogNameLength() {
		return maxCatalogNameLength;
	}
	public void setMaxCatalogNameLength(int maxCatalogNameLength) {
		this.maxCatalogNameLength = maxCatalogNameLength;
	}
	
	public int getMaxCharLiteralLength() {
		return maxCharLiteralLength;
	}
	public void setMaxCharLiteralLength(int maxCharLiteralLength) {
		this.maxCharLiteralLength = maxCharLiteralLength;
	}
	
	public int getMaxColumnNameLength() {
		return maxColumnNameLength;
	}
	public void setMaxColumnNameLength(int maxColumnNameLength) {
		this.maxColumnNameLength = maxColumnNameLength;
	}
	
	public int getMaxColumnsInGroupBy() {
		return maxColumnsInGroupBy;
	}
	public void setMaxColumnsInGroupBy(int maxColumnsInGroupBy) {
		this.maxColumnsInGroupBy = maxColumnsInGroupBy;
	}
	
	public int getMaxColumnsInIndex() {
		return maxColumnsInIndex;
	}
	public void setMaxColumnsInIndex(int maxColumnsInIndex) {
		this.maxColumnsInIndex = maxColumnsInIndex;
	}
	
	public int getMaxColumnsInOrderBy() {
		return maxColumnsInOrderBy;
	}
	public void setMaxColumnsInOrderBy(int maxColumnsInOrderBy) {
		this.maxColumnsInOrderBy = maxColumnsInOrderBy;
	}
	
	public int getMaxColumnsInSelect() {
		return maxColumnsInSelect;
	}
	public void setMaxColumnsInSelect(int maxColumnsInSelect) {
		this.maxColumnsInSelect = maxColumnsInSelect;
	}
	
	public int getMaxConnections() {
		return maxConnections;
	}
	public void setMaxConnections(int maxConnections) {
		this.maxConnections = maxConnections;
	}
	
	public int getMaxColumnsInTable() {
		return maxColumnsInTable;
	}
	public void setMaxColumnsInTable(int maxColumnsInTable) {
		this.maxColumnsInTable = maxColumnsInTable;
	}
	
	public int getMaxCursorNameLength() {
		return maxCursorNameLength;
	}
	public void setMaxCursorNameLength(int maxCursorNameLength) {
		this.maxCursorNameLength = maxCursorNameLength;
	}
	
	public int getMaxIndexLength() {
		return maxIndexLength;
	}
	public void setMaxIndexLength(int maxIndexLength) {
		this.maxIndexLength = maxIndexLength;
	}
	
	public long getMaxLogicalLobSize() {
		return maxLogicalLobSize;
	}
	public void setMaxLogicalLobSize(long maxLogicalLobSize) {
		this.maxLogicalLobSize = maxLogicalLobSize;
	}
	
	public int getMaxProcedureNameLength() {
		return maxProcedureNameLength;
	}
	public void setMaxProcedureNameLength(int maxProcedureNameLength) {
		this.maxProcedureNameLength = maxProcedureNameLength;
	}
	
	public int getMaxRowSize() {
		return maxRowSize;
	}
	public void setMaxRowSize(int maxRowSize) {
		this.maxRowSize = maxRowSize;
	}
	
	public int getMaxSchemaNameLength() {
		return maxSchemaNameLength;
	}
	public void setMaxSchemaNameLength(int maxSchemaNameLength) {
		this.maxSchemaNameLength = maxSchemaNameLength;
	}
	
	public int getMaxStatementLength() {
		return maxStatementLength;
	}
	public void setMaxStatementLength(int maxStatementLength) {
		this.maxStatementLength = maxStatementLength;
	}
	
	public int getMaxStatements() {
		return maxStatements;
	}
	public void setMaxStatements(int maxStatements) {
		this.maxStatements = maxStatements;
	}
	
	public int getMaxTableNameLength() {
		return maxTableNameLength;
	}
	public void setMaxTableNameLength(int maxTableNameLength) {
		this.maxTableNameLength = maxTableNameLength;
	}
	
	public int getMaxTablesInSelect() {
		return maxTablesInSelect;
	}
	public void setMaxTablesInSelect(int maxTablesInSelect) {
		this.maxTablesInSelect = maxTablesInSelect;
	}
	
	public int getMaxUserNameLength() {
		return maxUserNameLength;
	}
	public void setMaxUserNameLength(int maxUserNameLength) {
		this.maxUserNameLength = maxUserNameLength;
	}
	
	public Set<String> getNumericFunctions() {
		return numericFunctions;
	}
	public void setNumericFunctions(Set<String> numericFunctions) {
		this.numericFunctions = numericFunctions;
	}
	
	public Set<String> getSqlKeywords() {
		return sqlKeywords;
	}
	public void setSqlKeywords(Set<String> sqlKeywords) {
		this.sqlKeywords = sqlKeywords;
	}
	
	public String getProcedureTerm() {
		return procedureTerm;
	}
	public void setProcedureTerm(String procedureTerm) {
		this.procedureTerm = procedureTerm;
	}
	
	public Set<SchemaDetails> getSchemas() {
		return schemas;
	}
	public void setSchemas(Set<SchemaDetails> schemas) {
		this.schemas = schemas;
	}
	
	public String getSchemaTerm() {
		return schemaTerm;
	}
	public void setSchemaTerm(String schemaTerm) {
		this.schemaTerm = schemaTerm;
	}
	
	public String getSearchStringEscape() {
		return searchStringEscape;
	}
	public void setSearchStringEscape(String searchStringEscape) {
		this.searchStringEscape = searchStringEscape;
	}
	
	public Set<String> getStringFunctions() {
		return stringFunctions;
	}
	public void setStringFunctions(Set<String> stringFunctions) {
		this.stringFunctions = stringFunctions;
	}
	
	public Set<String> getSystemFunctions() {
		return systemFunctions;
	}
	public void setSystemFunctions(Set<String> systemFunctions) {
		this.systemFunctions = systemFunctions;
	}
	
	public Set<String> getTimeDateFunctions() {
		return timeDateFunctions;
	}
	public void setTimeDateFunctions(Set<String> timeDateFunctions) {
		this.timeDateFunctions = timeDateFunctions;
	}
	
	public Set<String> getTableTypes() {
		return tableTypes;
	}
	public void setTableTypes(Set<String> tableTypes) {
		this.tableTypes = tableTypes;
	}
	
	public Set<TypeInfo> getTypeInfos() {
		return typeInfos;
	}
	public void setTypeInfos(Set<TypeInfo> typeInfos) {
		this.typeInfos = typeInfos;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public Set<TableDetails> getTableDetails() {
		return tableDetails;
	}
	public void setTableDetails(Set<TableDetails> tableDetails) {
		this.tableDetails = tableDetails;
	}
	
	public Set<Attribute> getAttributes() {
		return attributes;
	}
	public void setAttributes(Set<Attribute> attributes) {
		this.attributes = attributes;
	}
	
	public Set<Column> getColumns() {
		return columns;
	}
	public void setColumns(Set<Column> columns) {
		this.columns = columns;
	}
	
	public Set<ColumnPrivilege> getColumnPrivileges() {
		return columnPrivileges;
	}
	public void setColumnPrivileges(Set<ColumnPrivilege> columnPrivileges) {
		this.columnPrivileges = columnPrivileges;
	}
	
	public Set<TablePrivilege> getTablePrivileges() {
		return tablePrivileges;
	}
	public void setTablePrivileges(Set<TablePrivilege> tablePrivileges) {
		this.tablePrivileges = tablePrivileges;
	}
	
	public Set<PseudoColumn> getPseudoColumns() {
		return pseudoColumns;
	}
	public void setPseudoColumns(Set<PseudoColumn> pseudoColumns) {
		this.pseudoColumns = pseudoColumns;
	}
	
	public Set<FunctionColumn> getFunctionColumns() {
		return functionColumns;
	}
	public void setFunctionColumns(Set<FunctionColumn> functionColumns) {
		this.functionColumns = functionColumns;
	}
	
	public Set<ProcedureColumn> getProcedureColumns() {
		return procedureColumns;
	}
	public void setProcedureColumns(Set<ProcedureColumn> procedureColumns) {
		this.procedureColumns = procedureColumns;
	}
	
	public Set<VersionColumn> getVersionColumns() {
		return versionColumns;
	}
	public void setVersionColumns(Set<VersionColumn> versionColumns) {
		this.versionColumns = versionColumns;
	}
	
	public Set<ImportedKey> getImportedKeys() {
		return importedKeys;
	}
	public void setImportedKeys(Set<ImportedKey> importedKeys) {
		this.importedKeys = importedKeys;
	}
	
	public Set<ExportedKey> getExportedKeys() {
		return exportedKeys;
	}
	public void setExportedKeys(Set<ExportedKey> exportedKeys) {
		this.exportedKeys = exportedKeys;
	}
	
	public Set<Function> getFunctions() {
		return functions;
	}
	public void setFunctions(Set<Function> functions) {
		this.functions = functions;
	}
	
	public Set<UserDefinedType> getUserDefinedTypes() {
		return userDefinedTypes;
	}
	public void setUserDefinedTypes(Set<UserDefinedType> userDefinedTypes) {
		this.userDefinedTypes = userDefinedTypes;
	}
	
	public Set<BestRowIdentifier> getBestRowIdentifiers() {
		return bestRowIdentifiers;
	}
	public void setBestRowIdentifiers(Set<BestRowIdentifier> bestRowIdentifiers) {
		this.bestRowIdentifiers = bestRowIdentifiers;
	}
	
	public Set<CrossReference> getCrossReferences() {
		return crossReferences;
	}
	public void setCrossReferences(Set<CrossReference> crossReferences) {
		this.crossReferences = crossReferences;
	}
	
	public Set<PrimaryKey> getPrimaryKeys() {
		return primaryKeys;
	}
	public void setPrimaryKeys(Set<PrimaryKey> primaryKeys) {
		this.primaryKeys = primaryKeys;
	}
	
	public Set<IndexInfo> getIndexInfos() {
		return indexInfos;
	}
	public void setIndexInfos(Set<IndexInfo> indexInfos) {
		this.indexInfos = indexInfos;
	}
	
	public Set<Procedure> getProcedures() {
		return procedures;
	}
	public void setProcedures(Set<Procedure> procedures) {
		this.procedures = procedures;
	}
	
	public Set<SuperTable> getSuperTables() {
		return superTables;
	}
	public void setSuperTables(Set<SuperTable> superTables) {
		this.superTables = superTables;
	}
	
	public Set<SuperType> getSuperTypes() {
		return superTypes;
	}
	public void setSuperTypes(Set<SuperType> superTypes) {
		this.superTypes = superTypes;
	}
}
