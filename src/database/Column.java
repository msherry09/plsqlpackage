/*
*   Program Name:
*   Author:         Michael Sherry
*   Date:
*   Purpose:
*   Revisions:
*/

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

/**
 *
 * @author Michael
 */
public class Column {
    private String columnName;
    private String columnType;
    private boolean primaryKey;

    public Column()
    {
        this.columnName = null;
        this.columnType = null;
        this.primaryKey = false;
    }

    public Column(String columnName, String columnType, boolean primaryKey)
    {
        this.columnName = columnName;
        this.columnType = columnType;
        this.primaryKey = primaryKey;
    }

    public Column(String columnName, String columnType)
    {
        this.columnName = columnName;
        this.columnType = columnType;
        this.primaryKey = false;
    }



    public String getColumnName()
    {
        return columnName;
    }

    public void setColumnName(String columnName)
    {
        this.columnName = columnName;
    }

    public String getColumnType()
    {
        return columnType;
    }

    public void setColumnType(String columnType)
    {
        this.columnType = columnType;
    }

    public boolean isPrimaryKey()
    {
        return primaryKey;
    }

    public void setPrimaryKey(boolean primaryKey)
    {
        this.primaryKey = primaryKey;
    }

    @Override
    public String toString()
    {
        return "Column Name: " + columnName + "\n"
                + "Column Type: " + columnType + "\n"
                + "Primary Key: " + primaryKey + "\n";
    }

}
