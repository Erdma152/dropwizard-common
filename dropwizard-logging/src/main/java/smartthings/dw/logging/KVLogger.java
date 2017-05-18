package smartthings.dw.logging;

import org.slf4j.Logger;
import org.slf4j.Marker;

import java.util.Collections;
import java.util.Map;

public class KVLogger {
	private KVLogger() {}

	public static void debug(Logger l, String key, Map<String, Object> params) {
		l.debug(buildLogMessage(key, params));
	}

	public static void debug(Logger l, String key) {
		debug(l, key, Collections.emptyMap());
	}

	public static void debug(Logger l, String key, Map<String, Object> params, Throwable t) {
		l.debug(buildLogMessage(key, params), t);
	}

	public static void debug(Logger l, Marker marker, String key, Map<String, Object> params) {
		l.debug(marker, buildLogMessage(key, params));
	}

	public static void debug(Logger l, Marker marker, String key) {
		debug(l, marker, key, Collections.emptyMap());
	}

	public static void debug(Logger l, Marker marker, String key, Map<String, Object> params, Throwable t) {
		l.debug(marker, buildLogMessage(key, params), t);
	}

	public static void info(Logger l, String key, Map<String, Object> params) {
		l.info(buildLogMessage(key, params));
	}

	public static void info(Logger l, String key) {
		info(l, key, Collections.emptyMap());
	}

	public static void info(Logger l, String key, Map<String, Object> params, Throwable t) {
		l.info(buildLogMessage(key, params), t);
	}

	public static void info(Logger l, Marker marker, String key, Map<String, Object> params) {
		l.info(marker, buildLogMessage(key, params));
	}

	public static void info(Logger l, Marker marker, String key) {
		info(l, marker, key, Collections.emptyMap());
	}

	public static void info(Logger l, Marker marker, String key, Map<String, Object> params, Throwable t) {
		l.info(marker, buildLogMessage(key, params), t);
	}

	public static void warn(Logger l, String key, Map<String, Object> params) {
		l.warn(buildLogMessage(key, params));
	}

	public static void warn(Logger l, String key) {
		warn(l, key, Collections.emptyMap());
	}

	public static void warn(Logger l, String key, Map<String, Object> params, Throwable t) {
		l.warn(buildLogMessage(key, params), t);
	}

	public static void warn(Logger l, Marker marker, String key, Map<String, Object> params) {
		l.warn(marker, buildLogMessage(key, params));
	}

	public static void warn(Logger l, Marker marker, String key) {
		warn(l, marker, key, Collections.emptyMap());
	}

	public static void warn(Logger l, Marker marker, String key, Map<String, Object> params, Throwable t) {
		l.warn(marker, buildLogMessage(key, params), t);
	}

	public static void error(Logger l, String key, Map<String, Object> params) {
		l.error(buildLogMessage(key, params));
	}

	public static void error(Logger l, String key) {
		error(l, key, Collections.emptyMap());
	}

	public static void error(Logger l, String key, Map<String, Object> params, Throwable t) {
		l.error(buildLogMessage(key, params), t);
	}

	public static void error(Logger l, Marker marker, String key, Map<String, Object> params) {
		l.error(marker, buildLogMessage(key, params));
	}

	public static void error(Logger l, Marker marker, String key) {
		error(l, marker, key, Collections.emptyMap());
	}

	public static void error(Logger l, Marker marker, String key, Map<String, Object> params, Throwable t) {
		l.error(marker, buildLogMessage(key, params), t);
	}

	public static void trace(Logger l, String key, Map<String, Object> params) {
		l.trace(buildLogMessage(key, params));
	}

	public static void trace(Logger l, String key) {
		trace(l, key, Collections.emptyMap());
	}

	public static void trace(Logger l, String key, Map<String, Object> params, Throwable t) {
		l.trace(buildLogMessage(key, params), t);
	}

	public static void trace(Logger l, Marker marker, String key, Map<String, Object> params) {
		l.trace(marker, buildLogMessage(key, params));
	}

	public static void trace(Logger l, Marker marker, String key) {
		trace(l, marker, key, Collections.emptyMap());
	}

	public static void trace(Logger l, Marker marker, String key, Map<String, Object> params, Throwable t) {
		l.trace(marker, buildLogMessage(key, params), t);
	}

	private static String buildLogMessage(String key, Map<String, Object> params) {
		StringBuilder sb = new StringBuilder(",key=").append(key);
		for ( Map.Entry<String, Object> e : params.entrySet()) {
			sb.append(", ").append(clean(e.getKey())).append('=').append(clean(e.getValue()));
		}
		sb.append(',');
		return sb.toString();
	}

	private static String clean(Object s) {
		if (s != null) {
			return s.toString().replace(",", "");
		}
		return null;
	}
}
