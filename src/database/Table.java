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
import java.util.ArrayList;

/**
 *
 * @author Michael
 */
public class Table {
    private String tableName;
    private ArrayList<Column> column;

    public Table()
    {
        this.tableName = null;
        this.column = new ArrayList<Column>();
    }

    public Table(String tableName)
    {
        this.tableName = tableName;
        this.column = new ArrayList<Column>();
    }

    public Table(String tableName, ArrayList<Column> column)
    {
        this.tableName = tableName;
        this.column = column;
    }

    public ArrayList<Column> getColumn()
    {
        return column;
    }

    public void setColumn(ArrayList<Column> column)
    {
        this.column = column;
    }

    public String getTableName()
    {
        return tableName;
    }

    public void setTableName(String tableName)
    {
        this.tableName = tableName;
    }

    public void addColumn(Column tmpColumn)
    {
        column.add(tmpColumn);
    }

    public Column getColumn(int tmp)
    {
        return column.get(tmp);
    }

    @Override
    public String toString()
    {
        String tmp = "Table Name: " + tableName + "\n";
        for(int i = 0;i < column.size(); i++)
        {
            tmp += column.get(i).toString();
        }
        return tmp;
    }

    /*
     return "Column Name: " + columnName + "\n"
                + "Column Type: " + columnType + "\n"
                + "Primary Key: " + primaryKey;

     */
}
