package controller;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class AuthFilter implements Filter {

    @Override
    public boolean isLoggable(LogRecord record) {
        return false;
    }
}
