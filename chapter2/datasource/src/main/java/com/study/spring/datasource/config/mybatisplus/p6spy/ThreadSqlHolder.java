package com.study.spring.datasource.config.mybatisplus.p6spy;

/**
 * @author Administrator
 */
public class ThreadSqlHolder {
    private static final InheritableThreadLocal<String> LOCAL_THREAD = new InheritableThreadLocal<>();

    public static String get() {
        return LOCAL_THREAD.get();
    }

    public static void set(String sql) {
        LOCAL_THREAD.set(sql);
    }

    public static void clear() {
        LOCAL_THREAD.remove();
    }

}
