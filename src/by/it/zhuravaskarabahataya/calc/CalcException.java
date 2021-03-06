package by.it.zhuravaskarabahataya.calc;

class CalcException extends Exception {
    public CalcException(String message) {
        super("ERROR:" + message);
        Log.writeExceptionToLogFile(message);
    }

    public CalcException() {
        super();
    }

    public CalcException(String message, Throwable cause) {
        super("ERROR:" + message, cause);
    }

    public CalcException(Throwable cause) {
        super(cause);
    }

    protected CalcException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super("ERROR:" + message, cause, enableSuppression, writableStackTrace);
    }
}
