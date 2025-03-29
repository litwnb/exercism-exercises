public class LogLine {
    private final String logLine;
    private final LogLevel parsedLog;

    public LogLine(String logLine) {
        this.logLine = logLine;
        String level = logLine.substring(1, 4);
        switch (level) {
            case "TRC" -> parsedLog = LogLevel.TRACE;
            case "DBG" -> parsedLog = LogLevel.DEBUG;
            case "INF" -> parsedLog = LogLevel.INFO;
            case "WRN" -> parsedLog = LogLevel.WARNING;
            case "ERR" -> parsedLog = LogLevel.ERROR;
            case "FTL" -> parsedLog = LogLevel.FATAL;
            default -> parsedLog = LogLevel.UNKNOWN;
        }
    }

    public LogLevel getLogLevel() {
        return parsedLog;
    }

    public String getOutputForShortLog() {
        String output = logLine.substring(7);
        String code;
        switch (parsedLog) {
            case UNKNOWN -> code = "0:";
            case TRACE -> code = "1:";
            case DEBUG -> code = "2:";
            case INFO -> code = "4:";
            case WARNING -> code = "5:";
            case ERROR -> code = "6:";
            case FATAL -> code = "42:";
            default -> code = "";
        }
        return code + output;
    }
}
