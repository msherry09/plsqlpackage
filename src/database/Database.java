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
public class Database {
    private ArrayList<Table> table;

    public Database()
    {
        this.table = new ArrayList<Table>();
    }

    public Database(ArrayList<Table> table)
    {
        this.table = table;
    }

    public ArrayList<Table> getTable()
    {
        return table;
    }

    public void setTable(ArrayList<Table> table)
    {
        this.table = table;
    }

    public void addTable(Table tmptable)
    {
        table.add(tmptable);
    }

    public Table getTable(int tmp)
    {
        return table.get(tmp);
    }

    @Override
    public String toString()
    {
        String tmp = "";
        for(int i = 0;i<table.size();i++)
        {
            tmp += table.get(i).toString() + "\n";
        }
        return tmp;
    }

}
