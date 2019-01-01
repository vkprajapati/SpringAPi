package com.gyftx.Gyftx_Rest.Security;


//This class Authenticate users with the provided UserName and Password.
//If Authentication is successful our this class will issue an access TOKEN.
//This class is also use come constants like token expire time, token prefix, header and sign_up_url etc.
//This Class is holds login Details. 

public class SecurityConstants {

//	private static final long SECONDS_IN_MINUTE = 60;
//	private static final long MINUTES_IN_HOUR = 60;
//	private static final long MILLIS_IN_SECOND = 1000;
//	private static final long DAYS_IN_YEAR = 365;
//	private static final long HOURS_IN_DAY = 24;
	static final long EXPIRATION_TIME= 864000000;
//	        (long)MILLIS_IN_SECOND * SECONDS_IN_MINUTE * MINUTES_IN_HOUR
//	        * HOURS_IN_DAY * DAYS_IN_YEAR;
	public static final String TOKEN_PREFIX = "Bearer";
	public static final String HEADER_STRING = "Authorization";
	public static final String SIGN_UP_URL = "/users";
	public static final String TOKEN_SECRET = "jf9i4jgu83nfl0";
}
