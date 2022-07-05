package com.study.spring.datasource.config.mybatisplus.p6spy;

import com.p6spy.engine.logging.Category;
import com.p6spy.engine.spy.appender.P6Logger;
import lombok.extern.slf4j.Slf4j;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @author Administrator
 */
@Slf4j
public class SqlFormatByP6spy implements P6Logger {
    @Override
    public void logException(Exception e) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        this.logText(sw.toString());
    }

    /**
     * Logs the text.
     *
     * @param text to be logged
     */
    @Override
    public void logText(String text) {
        log.debug(text);
        if (log.isInfoEnabled()) {
            ThreadSqlHolder.set(text);
        }
    }

    @Override
    public void logSQL(int connectionId, String now, long elapsed, Category category, String prepared, String sql, String url) {
        logText(sql.replaceAll("\n ", ""));
    }

    @Override
    public boolean isCategoryEnabled(Category category) {
        return true;
    }
}
