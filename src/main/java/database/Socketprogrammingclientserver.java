/*
 * This file is generated by jOOQ.
 */
package database;


import database.tables.Message;
import database.tables.User;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Socketprogrammingclientserver extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>socketprogrammingclientserver</code>
     */
    public static final Socketprogrammingclientserver SOCKETPROGRAMMINGCLIENTSERVER = new Socketprogrammingclientserver();

    /**
     * The table <code>socketprogrammingclientserver.message</code>.
     */
    public final Message MESSAGE = Message.MESSAGE;

    /**
     * The table <code>socketprogrammingclientserver.user</code>.
     */
    public final User USER = User.USER;

    /**
     * No further instances allowed
     */
    private Socketprogrammingclientserver() {
        super("socketprogrammingclientserver", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Message.MESSAGE,
            User.USER
        );
    }
}
