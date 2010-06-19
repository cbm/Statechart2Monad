package statechart2Monad;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TransExpr {
	
	
	public static boolean HasEvent ( String trExp ) {
		String ret = getEventOfExpression(trExp);
		if ( ret == null )
			return false;
		return ret.compareTo("null")!=0;
	}
	
	public static boolean HasCondition ( String trExp ) {
		return getConditionOfExpression(trExp)!=null;
	}
	
	public static boolean HasAction ( String trExp ) {
		return getActionOfExpression(trExp)!=null;
	}
	
	public static String getEventOfExpression(String expression) {
		// pattern for events
		Pattern eventPattern = Pattern
				.compile("^[\\w\\W&&[^/\\[\\]]]+(\\[[\\w\\W&&[^\\[\\]]]+\\])?(/[\\w\\W]+)?$");
		Matcher eventMatcher = eventPattern.matcher(expression);
		if (eventMatcher.find()
				&& (eventMatcher.group().length() == expression.length())) {
			StringTokenizer st = new StringTokenizer(expression, "[]/");
			return st.nextToken();
		}
		return null;
	}	
	
	
	public static String getConditionOfExpression(String expression) {
		// pattern for conditions
		Pattern conditionPattern = Pattern
				.compile("^([\\w\\W&&[^/\\[\\]]]+)?(\\[[\\w\\W&&[^\\[\\]]]+\\])(/[\\w\\W]+)?$");
		Matcher conditionMatcher = conditionPattern.matcher(expression);
		if (conditionMatcher.find()
				&& (conditionMatcher.group().length() == expression.length())) {
			StringTokenizer st = new StringTokenizer(expression, "]");
			String condition = st.nextToken();
			condition = condition.substring(condition.indexOf("[") + 1);
			return condition;
		}
		return null;
	}

	public static String getActionOfExpression(String expression) {
		// pattern for actions
		Pattern actionPattern = Pattern
				.compile("^([\\w\\W&&[^/\\[\\]]]+)?(\\[[\\w\\W&&[^\\[\\]]]+\\])?(/[\\w\\W]+)$");
		Matcher actionMatcher = actionPattern.matcher(expression);
		if (actionMatcher.find()
				&& (actionMatcher.group().length() == expression.length())) {
			String action = expression
					.substring(expression.lastIndexOf("/") + 1);
			return action;
		}
		return null;
	}	

}
