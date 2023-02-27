package com.so.logger.format;

import org.apache.logging.log4j.message.AbstractMessageFactory;
import org.apache.logging.log4j.message.Message;
import org.apache.logging.log4j.message.ParameterizedMessage;
import org.apache.logging.log4j.message.SimpleMessage;

public class ApplicationMessageFormatter extends AbstractMessageFactory {

	private static final long serialVersionUID = 1L;

	@Override
	public Message newMessage(String message) {
		return new SimpleMessage(setFormat(message));
	}

	@Override
	public Message newMessage(String message, Object... params) {
		return new ParameterizedMessage(setFormat(message), params);
	}

	private String setFormat(String message) {
		return "[ApplicationLogformatter]" + message;
	}
}
