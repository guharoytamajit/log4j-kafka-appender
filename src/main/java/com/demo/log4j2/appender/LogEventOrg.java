package com.demo.log4j2.appender;

public class LogEventOrg {
String logger;
String level;
String message;
public String getLogger() {
	return logger;
}
public void setLogger(String logger) {
	this.logger = logger;
}
public String getLevel() {
	return level;
}
public void setLevel(String level) {
	this.level = level;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public LogEventOrg(String logger, String level, String message) {
	super();
	this.logger = logger;
	this.level = level;
	this.message = message;
}
public LogEventOrg() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "LogEvent [logger=" + logger + ", level=" + level + ", message=" + message + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((level == null) ? 0 : level.hashCode());
	result = prime * result + ((logger == null) ? 0 : logger.hashCode());
	result = prime * result + ((message == null) ? 0 : message.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	LogEventOrg other = (LogEventOrg) obj;
	if (level == null) {
		if (other.level != null)
			return false;
	} else if (!level.equals(other.level))
		return false;
	if (logger == null) {
		if (other.logger != null)
			return false;
	} else if (!logger.equals(other.logger))
		return false;
	if (message == null) {
		if (other.message != null)
			return false;
	} else if (!message.equals(other.message))
		return false;
	return true;
}

}
