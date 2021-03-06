package com.jan.quartz;

/**
 * 任务调度通用常量
 * 
 * @author jan 橙寂
 */
public interface ScheduleConstants
{
    public static final String TASK_PRE = "TASK";

    /** 执行目标key */
    public static final String TASK_PROPERTIES = "TASK_PROPERTIES";

    /** 默认 */
    public static final String MISFIRE_DEFAULT = "0";

    /** 立即触发执行 */
    public static final String MISFIRE_IGNORE_MISFIRES = "1";

    /** 触发一次执行 */
    public static final String MISFIRE_FIRE_AND_PROCEED = "2";

    /** 不触发立即执行 */
    public static final String MISFIRE_DO_NOTHING = "3";

    /**
     * 失败状态
     */
    public static final String FAIL_STATUS = "1";

    /**
     * 成功状态
     */
    public static final String SUCCESS_STATUS = "2";


    /**
     * 任务的关闭的状态
     */
    public static final String STOP_STATUS = "1";

    public enum Status
    {
        /**
         * 正常
         */
        NORMAL("0"),
        /**
         * 暂停
         */
        PAUSE("1");

        private String value;

        private Status(String value)
        {
            this.value = value;
        }

        public String getValue()
        {
            return value;
        }
    }
}
