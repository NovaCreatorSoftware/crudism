package com.novacreator.crudism.controllers;

import java.util.Collection;
import java.util.Collections;
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
	void setCurrentCatalog(String currentCatalog) {
		this.currentCatalog = currentCatalog;
	}
	
	public String getFromClientInfo(String key) {
		return clientInfo.get(key);
	}
	public Map<String, String> getClientInfo() {
		return Collections.unmodifiableMap(clientInfo);
	}
	void addToClientInfo(String key, String value) {
		clientInfo.put(key, value);
	}

	public String getSchema() {
		return schema;
	}
	void setSchema(String schema) {
		this.schema = schema;
	}
	
	public String getIdentifierQuote() {
		return identifierQuote;
	}
	void setIdentifierQuote(String identifierQuote) {
		this.identifierQuote = identifierQuote;
	}
	
	public Set<String> getCatalogs() {
		return catalogs;
	}
	void addToCatalogs(String catalog) {
		catalogs.add(catalog);
	}

	public String getCatalogSeparator() {
		return catalogSeparator;
	}
	void setCatalogSeparator(String catalogSeparator) {
		this.catalogSeparator = catalogSeparator;
	}
	
	public String getCatalogTerm() {
		return catalogTerm;
	}
	void setCatalogTerm(String catalogTerm) {
		this.catalogTerm = catalogTerm;
	}
	
	public Set<ClientInfo> getMetadataClientInfos() {
		return Collections.unmodifiableSet(metadataClientInfos);
	}
	void addToMetadataClientInfos(ClientInfo metadataClientInfo) {
		this.metadataClientInfos.add(metadataClientInfo);
	}
	
	public int getDatabaseMajorVersion() {
		return databaseMajorVersion;
	}
	void setDatabaseMajorVersion(int databaseMajorVersion) {
		this.databaseMajorVersion = databaseMajorVersion;
	}
	
	public int getDatabaseMinorVersion() {
		return databaseMinorVersion;
	}
	void setDatabaseMinorVersion(int databaseMinorVersion) {
		this.databaseMinorVersion = databaseMinorVersion;
	}
	
	public String getDatabaseProductName() {
		return databaseProductName;
	}
	void setDatabaseProductName(String databaseProductName) {
		this.databaseProductName = databaseProductName;
	}
	
	public String getDatabaseProductVersion() {
		return databaseProductVersion;
	}
	void setDatabaseProductVersion(String databaseProductVersion) {
		this.databaseProductVersion = databaseProductVersion;
	}
	
	public int getDefaultTransactionIsolation() {
		return defaultTransactionIsolation;
	}
	void setDefaultTransactionIsolation(int defaultTransactionIsolation) {
		this.defaultTransactionIsolation = defaultTransactionIsolation;
	}
	
	public int getDriverMajorVersion() {
		return driverMajorVersion;
	}
	void setDriverMajorVersion(int driverMajorVersion) {
		this.driverMajorVersion = driverMajorVersion;
	}
	
	public int getDriverMinorVersion() {
		return driverMinorVersion;
	}
	void setDriverMinorVersion(int driverMinorVersion) {
		this.driverMinorVersion = driverMinorVersion;
	}
	
	public String getDriverName() {
		return driverName;
	}
	void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	
	public String getDriverVersion() {
		return driverVersion;
	}
	void setDriverVersion(String driverVersion) {
		this.driverVersion = driverVersion;
	}
	
	public int getJdbcMajorVersion() {
		return jdbcMajorVersion;
	}
	void setJdbcMajorVersion(int jdbcMajorVersion) {
		this.jdbcMajorVersion = jdbcMajorVersion;
	}
	
	public int getJdbcMinorVersion() {
		return jdbcMinorVersion;
	}
	void setJdbcMinorVersion(int jdbcMinorVersion) {
		this.jdbcMinorVersion = jdbcMinorVersion;
	}
	
	public int getMaxBinaryLiteralLength() {
		return maxBinaryLiteralLength;
	}
	void setMaxBinaryLiteralLength(int maxBinaryLiteralLength) {
		this.maxBinaryLiteralLength = maxBinaryLiteralLength;
	}
	
	public int getMaxCatalogNameLength() {
		return maxCatalogNameLength;
	}
	void setMaxCatalogNameLength(int maxCatalogNameLength) {
		this.maxCatalogNameLength = maxCatalogNameLength;
	}
	
	public int getMaxCharLiteralLength() {
		return maxCharLiteralLength;
	}
	void setMaxCharLiteralLength(int maxCharLiteralLength) {
		this.maxCharLiteralLength = maxCharLiteralLength;
	}
	
	public int getMaxColumnNameLength() {
		return maxColumnNameLength;
	}
	void setMaxColumnNameLength(int maxColumnNameLength) {
		this.maxColumnNameLength = maxColumnNameLength;
	}
	
	public int getMaxColumnsInGroupBy() {
		return maxColumnsInGroupBy;
	}
	void setMaxColumnsInGroupBy(int maxColumnsInGroupBy) {
		this.maxColumnsInGroupBy = maxColumnsInGroupBy;
	}
	
	public int getMaxColumnsInIndex() {
		return maxColumnsInIndex;
	}
	void setMaxColumnsInIndex(int maxColumnsInIndex) {
		this.maxColumnsInIndex = maxColumnsInIndex;
	}
	
	public int getMaxColumnsInOrderBy() {
		return maxColumnsInOrderBy;
	}
	void setMaxColumnsInOrderBy(int maxColumnsInOrderBy) {
		this.maxColumnsInOrderBy = maxColumnsInOrderBy;
	}
	
	public int getMaxColumnsInSelect() {
		return maxColumnsInSelect;
	}
	void setMaxColumnsInSelect(int maxColumnsInSelect) {
		this.maxColumnsInSelect = maxColumnsInSelect;
	}
	
	public int getMaxConnections() {
		return maxConnections;
	}
	void setMaxConnections(int maxConnections) {
		this.maxConnections = maxConnections;
	}
	
	public int getMaxColumnsInTable() {
		return maxColumnsInTable;
	}
	void setMaxColumnsInTable(int maxColumnsInTable) {
		this.maxColumnsInTable = maxColumnsInTable;
	}
	
	public int getMaxCursorNameLength() {
		return maxCursorNameLength;
	}
	void setMaxCursorNameLength(int maxCursorNameLength) {
		this.maxCursorNameLength = maxCursorNameLength;
	}
	
	public int getMaxIndexLength() {
		return maxIndexLength;
	}
	void setMaxIndexLength(int maxIndexLength) {
		this.maxIndexLength = maxIndexLength;
	}
	
	public long getMaxLogicalLobSize() {
		return maxLogicalLobSize;
	}
	void setMaxLogicalLobSize(long maxLogicalLobSize) {
		this.maxLogicalLobSize = maxLogicalLobSize;
	}
	
	public int getMaxProcedureNameLength() {
		return maxProcedureNameLength;
	}
	void setMaxProcedureNameLength(int maxProcedureNameLength) {
		this.maxProcedureNameLength = maxProcedureNameLength;
	}
	
	public int getMaxRowSize() {
		return maxRowSize;
	}
	void setMaxRowSize(int maxRowSize) {
		this.maxRowSize = maxRowSize;
	}
	
	public int getMaxSchemaNameLength() {
		return maxSchemaNameLength;
	}
	void setMaxSchemaNameLength(int maxSchemaNameLength) {
		this.maxSchemaNameLength = maxSchemaNameLength;
	}
	
	public int getMaxStatementLength() {
		return maxStatementLength;
	}
	void setMaxStatementLength(int maxStatementLength) {
		this.maxStatementLength = maxStatementLength;
	}
	
	public int getMaxStatements() {
		return maxStatements;
	}
	void setMaxStatements(int maxStatements) {
		this.maxStatements = maxStatements;
	}
	
	public int getMaxTableNameLength() {
		return maxTableNameLength;
	}
	void setMaxTableNameLength(int maxTableNameLength) {
		this.maxTableNameLength = maxTableNameLength;
	}
	
	public int getMaxTablesInSelect() {
		return maxTablesInSelect;
	}
	void setMaxTablesInSelect(int maxTablesInSelect) {
		this.maxTablesInSelect = maxTablesInSelect;
	}
	
	public int getMaxUserNameLength() {
		return maxUserNameLength;
	}
	void setMaxUserNameLength(int maxUserNameLength) {
		this.maxUserNameLength = maxUserNameLength;
	}
	
	public Set<String> getNumericFunctions() {
		return Collections.unmodifiableSet(numericFunctions);
	}
	void addToNumericFunctions(String numericFunction) {
		this.numericFunctions.add(numericFunction);
	}
	void addAllToNumericFunctions(Collection<String> numericFunctions) {
		this.numericFunctions.addAll(numericFunctions);
	}
	
	public Set<String> getSqlKeywords() {
		return Collections.unmodifiableSet(sqlKeywords);
	}
	void addToSqlKeywords(String sqlKeyword) {
		this.sqlKeywords.add(sqlKeyword);
	}
	void addAllToSqlKeywords(Collection<String> sqlKeywords) {
		this.sqlKeywords.addAll(sqlKeywords);
	}
	
	public String getProcedureTerm() {
		return procedureTerm;
	}
	void setProcedureTerm(String procedureTerm) {
		this.procedureTerm = procedureTerm;
	}
	
	public Set<SchemaDetails> getSchemas() {
		return Collections.unmodifiableSet(schemas);
	}
	void addToSchemas(SchemaDetails schema) {
		this.schemas.add(schema);
	}
	
	public String getSchemaTerm() {
		return schemaTerm;
	}
	void setSchemaTerm(String schemaTerm) {
		this.schemaTerm = schemaTerm;
	}
	
	public String getSearchStringEscape() {
		return searchStringEscape;
	}
	void setSearchStringEscape(String searchStringEscape) {
		this.searchStringEscape = searchStringEscape;
	}
	
	public Set<String> getStringFunctions() {
		return Collections.unmodifiableSet(stringFunctions);
	}
	void addToStringFunctions(String stringFunction) {
		this.stringFunctions.add(stringFunction);
	}
	void addAllToStringFunctions(Collection<String> stringFunctions) {
		this.stringFunctions.addAll(stringFunctions);
	}
	
	public Set<String> getSystemFunctions() {
		return Collections.unmodifiableSet(systemFunctions);
	}
	void addToSystemFunctions(String systemFunction) {
		this.systemFunctions.add(systemFunction);
	}
	void addAllToSystemFunctions(Collection<String> systemFunctions) {
		this.systemFunctions.addAll(systemFunctions);
	}
	
	public Set<String> getTimeDateFunctions() {
		return Collections.unmodifiableSet(timeDateFunctions);
	}
	void addToTimeDateFunctions(String timeDateFunction) {
		this.timeDateFunctions.add(timeDateFunction);
	}
	void addAllToTimeDateFunctions(Collection<String> timeDateFunctions) {
		this.timeDateFunctions.addAll(timeDateFunctions);
	}
	
	public Set<String> getTableTypes() {
		return Collections.unmodifiableSet(tableTypes);
	}
	void addToTableTypes(String tableType) {
		this.tableTypes.add(tableType);
	}
	
	public Set<TypeInfo> getTypeInfos() {
		return Collections.unmodifiableSet(typeInfos);
	}
	void addToTypeInfos(TypeInfo typeInfo) {
		this.typeInfos.add(typeInfo);
	}
	
	public String getUrl() {
		return url;
	}
	void setUrl(String url) {
		this.url = url;
	}
	
	public String getUserName() {
		return userName;
	}
	void setUserName(String userName) {
		this.userName = userName;
	}
	
	public Set<TableDetails> getTableDetails() {
		return Collections.unmodifiableSet(tableDetails);
	}
	void addToTableDetails(TableDetails tableDetail) {
		this.tableDetails.add(tableDetail);
	}
	
	public Set<Attribute> getAttributes() {
		return Collections.unmodifiableSet(attributes);
	}
	void addToAttributes(Attribute attribute) {
		this.attributes.add(attribute);
	}
	
	public Set<Column> getColumns() {
		return Collections.unmodifiableSet(columns);
	}
	void addToColumns(Column column) {
		this.columns.add(column);
	}
	
	public Set<ColumnPrivilege> getColumnPrivileges() {
		return Collections.unmodifiableSet(columnPrivileges);
	}
	void addToColumnPrivileges(ColumnPrivilege columnPrivilege) {
		this.columnPrivileges.add(columnPrivilege);
	}
	
	public Set<TablePrivilege> getTablePrivileges() {
		return Collections.unmodifiableSet(tablePrivileges);
	}
	void addToTablePrivileges(TablePrivilege tablePrivilege) {
		this.tablePrivileges.add(tablePrivilege);
	}
	
	public Set<PseudoColumn> getPseudoColumns() {
		return Collections.unmodifiableSet(pseudoColumns);
	}
	void addToPseudoColumns(PseudoColumn pseudoColumn) {
		this.pseudoColumns.add(pseudoColumn);
	}
	
	public Set<FunctionColumn> getFunctionColumns() {
		return Collections.unmodifiableSet(functionColumns);
	}
	void addToFunctionColumns(FunctionColumn functionColumn) {
		this.functionColumns.add(functionColumn);
	}
	
	public Set<ProcedureColumn> getProcedureColumns() {
		return Collections.unmodifiableSet(procedureColumns);
	}
	void addToProcedureColumns(ProcedureColumn procedureColumn) {
		this.procedureColumns.add(procedureColumn);
	}
	
	public Set<VersionColumn> getVersionColumns() {
		return Collections.unmodifiableSet(versionColumns);
	}
	void addToVersionColumns(VersionColumn versionColumn) {
		this.versionColumns.add(versionColumn);
	}
	
	public Set<ImportedKey> getImportedKeys() {
		return Collections.unmodifiableSet(importedKeys);
	}
	void addToImportedKeys(ImportedKey importedKey) {
		this.importedKeys.add(importedKey);
	}
	
	public Set<ExportedKey> getExportedKeys() {
		return Collections.unmodifiableSet(exportedKeys);
	}
	void addToExportedKeys(ExportedKey exportedKey) {
		this.exportedKeys.add(exportedKey);
	}
	
	public Set<Function> getFunctions() {
		return Collections.unmodifiableSet(functions);
	}
	void addToFunctions(Function function) {
		this.functions.add(function);
	}
	
	public Set<UserDefinedType> getUserDefinedTypes() {
		return Collections.unmodifiableSet(userDefinedTypes);
	}
	void addToUserDefinedTypes(UserDefinedType userDefinedType) {
		this.userDefinedTypes.add(userDefinedType);
	}
	
	public Set<BestRowIdentifier> getBestRowIdentifiers() {
		return Collections.unmodifiableSet(bestRowIdentifiers);
	}
	void addToBestRowIdentifiers(BestRowIdentifier bestRowIdentifier) {
		this.bestRowIdentifiers.add(bestRowIdentifier);
	}
	
	public Set<CrossReference> getCrossReferences() {
		return Collections.unmodifiableSet(crossReferences);
	}
	void addToCrossReferences(CrossReference crossReference) {
		this.crossReferences.add(crossReference);
	}
	
	public Set<PrimaryKey> getPrimaryKeys() {
		return Collections.unmodifiableSet(primaryKeys);
	}
	void addToPrimaryKeys(PrimaryKey primaryKey) {
		this.primaryKeys.add(primaryKey);
	}
	
	public Set<IndexInfo> getIndexInfos() {
		return Collections.unmodifiableSet(indexInfos);
	}
	void addToIndexInfos(IndexInfo indexInfo) {
		this.indexInfos.add(indexInfo);
	}
	
	public Set<Procedure> getProcedures() {
		return Collections.unmodifiableSet(procedures);
	}
	void addToProcedures(Procedure procedure) {
		this.procedures.add(procedure);
	}
	
	public Set<SuperTable> getSuperTables() {
		return Collections.unmodifiableSet(superTables);
	}
	void addToSuperTables(SuperTable superTable) {
		this.superTables.add(superTable);
	}
	
	public Set<SuperType> getSuperTypes() {
		return Collections.unmodifiableSet(superTypes);
	}
	void addToSuperTypes(SuperType superType) {
		this.superTypes.add(superType);
	}
}
