package kr.go.seoul.seoultrail.Common;

import kr.go.seoul.seoultrail.Course;
import kr.go.seoul.seoultrail.CourseInfo.CourseListFragment;
import kr.go.seoul.seoultrail.CourseInfo.CourseMapFragment;
import kr.go.seoul.seoultrail.CourseStamp.CourseStampFragment;
import kr.go.seoul.seoultrail.Information;
import kr.go.seoul.seoultrail.MainActivity;
import kr.go.seoul.seoultrail.TrailInformation.TourInfoFragment;
import kr.go.seoul.seoultrail.Stamp;

/**
 * Created by ntsys on 2016-09-05.
 */
public class PublicDefine {

    public static MainActivity mainActivity;

    public static Course course;
    public static CourseListFragment courseListFragment;
    public static CourseMapFragment courseMapFragment;
    public static Information information;
    public static CourseStampFragment courseStampFragment;
    public static TourInfoFragment tourInfoFragment;

    public static String serviceSmgisKey = "a2e67e834d624f09aa68f1a1bdfa5fa5";
    public static String nMapClientId = "lusQzicuKpnMyPi_pLbv";

    public static String imageHostUrl = "http://map.seoul.go.kr";

    public static String appKey = "app.A030.gil.seoul.go.kr";
    public static String appLoggingActionKey = "http://app.A030.gil.seoul.go.kr/";
    public static String appLoggingUrl = "http://weblog.eseoul.go.kr/wlo/Logging";
    public static Stamp stamp;
}
