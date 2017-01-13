package model.enums


class StateTest extends GroovyTestCase {
    void testGet() {
        assertEquals(State.ALABAMA, State.get("AL"))
        assertEquals(State.ALASKA, State.get("AK"))
        assertEquals(State.ARIZONA, State.get("AZ"))
        assertEquals(State.ARKANSAS, State.get("AR"))
        assertEquals(State.CALIFORNIA, State.get("CA"))
        assertEquals(State.COLORADO, State.get("CO"))
        assertEquals(State.CONNECTICUT, State.get("CT"))
        assertEquals(State.DELAWARE, State.get("DE"))
        assertEquals(State.DISTRICT_OF_COLUMBIA, State.get("DC"))
        assertEquals(State.FLORIDA, State.get("FL"))
        assertEquals(State.GEORGIA, State.get("GA"))
        assertEquals(State.HAWAII, State.get("HI"))
        assertEquals(State.IDAHO, State.get("ID"))
        assertEquals(State.ILLINOIS, State.get("IL"))
        assertEquals(State.INDIANA, State.get("IN"))
        assertEquals(State.IOWA, State.get("IA"))
        assertEquals(State.KANSAS, State.get("KS"))
        assertEquals(State.KENTUCKY, State.get("KY"))
        assertEquals(State.LOUISIANA, State.get("LA"))
        assertEquals(State.MAINE, State.get("ME"))
        assertEquals(State.MARYLAND, State.get("MD"))
        assertEquals(State.MASSACHUSETTS, State.get("MA"))
        assertEquals(State.MICHIGAN, State.get("MI"))
        assertEquals(State.MINNESOTA, State.get("MN"))
        assertEquals(State.MISSISSIPPI, State.get("MS"))
        assertEquals(State.MISSOURI, State.get("MO"))
        assertEquals(State.MONTANA, State.get("MT"))
        assertEquals(State.NEBRASKA, State.get("NE"))
        assertEquals(State.NEVADA, State.get("NV"))
        assertEquals(State.NEW_HAMPSHIRE, State.get("NH"))
        assertEquals(State.NEW_JERSEY, State.get("NJ"))
        assertEquals(State.NEW_MEXICO, State.get("NM"))
        assertEquals(State.NEW_YORK, State.get("NY"))
        assertEquals(State.NORTH_CAROLINA, State.get("NC"))
        assertEquals(State.NORTH_DAKOTA, State.get("ND"))
        assertEquals(State.OHIO, State.get("OH"))
        assertEquals(State.OKLAHOMA, State.get("OK"))
        assertEquals(State.OREGON, State.get("OR"))
        assertEquals(State.PENNSYLVANIA, State.get("PA"))
        assertEquals(State.RHODE_ISLAND, State.get("RI"))
        assertEquals(State.SOUTH_CAROLINA, State.get("SC"))
        assertEquals(State.SOUTH_DAKOTA, State.get("SD"))
        assertEquals(State.TENNESSEE, State.get("TN"))
        assertEquals(State.TEXAS, State.get("TX"))
        assertEquals(State.UTAH, State.get("UT"))
        assertEquals(State.VERMONT, State.get("VT"))
        assertEquals(State.VIRGINIA, State.get("VA"))
        assertEquals(State.WASHINGTON, State.get("WA"))
        assertEquals(State.WEST_VIRGINIA, State.get("WV"))
        assertEquals(State.WISCONSIN, State.get("WI"))
        assertEquals(State.WYOMING, State.get("WY"))
        assertEquals(null, State.get("ZZ"))
    }

    void testGetLowerCase() {
        assertEquals(State.ALABAMA, State.get("al"))
        assertEquals(State.ALASKA, State.get("ak"))
        assertEquals(State.ARIZONA, State.get("az"))
        assertEquals(State.ARKANSAS, State.get("ar"))
        assertEquals(State.CALIFORNIA, State.get("ca"))
        assertEquals(State.COLORADO, State.get("co"))
        assertEquals(State.CONNECTICUT, State.get("ct"))
        assertEquals(State.DELAWARE, State.get("de"))
        assertEquals(State.DISTRICT_OF_COLUMBIA, State.get("dc"))
        assertEquals(State.FLORIDA, State.get("fl"))
        assertEquals(State.GEORGIA, State.get("ga"))
        assertEquals(State.HAWAII, State.get("hi"))
        assertEquals(State.IDAHO, State.get("id"))
        assertEquals(State.ILLINOIS, State.get("il"))
        assertEquals(State.INDIANA, State.get("in"))
        assertEquals(State.IOWA, State.get("ia"))
        assertEquals(State.KANSAS, State.get("ks"))
        assertEquals(State.KENTUCKY, State.get("ky"))
        assertEquals(State.LOUISIANA, State.get("la"))
        assertEquals(State.MAINE, State.get("me"))
        assertEquals(State.MARYLAND, State.get("md"))
        assertEquals(State.MASSACHUSETTS, State.get("ma"))
        assertEquals(State.MICHIGAN, State.get("mi"))
        assertEquals(State.MINNESOTA, State.get("mn"))
        assertEquals(State.MISSISSIPPI, State.get("ms"))
        assertEquals(State.MISSOURI, State.get("mo"))
        assertEquals(State.MONTANA, State.get("mt"))
        assertEquals(State.NEBRASKA, State.get("ne"))
        assertEquals(State.NEVADA, State.get("nv"))
        assertEquals(State.NEW_HAMPSHIRE, State.get("nh"))
        assertEquals(State.NEW_JERSEY, State.get("nj"))
        assertEquals(State.NEW_MEXICO, State.get("nm"))
        assertEquals(State.NEW_YORK, State.get("ny"))
        assertEquals(State.NORTH_CAROLINA, State.get("nc"))
        assertEquals(State.NORTH_DAKOTA, State.get("nd"))
        assertEquals(State.OHIO, State.get("oh"))
        assertEquals(State.OKLAHOMA, State.get("ok"))
        assertEquals(State.OREGON, State.get("or"))
        assertEquals(State.PENNSYLVANIA, State.get("pa"))
        assertEquals(State.RHODE_ISLAND, State.get("ri"))
        assertEquals(State.SOUTH_CAROLINA, State.get("sc"))
        assertEquals(State.SOUTH_DAKOTA, State.get("sd"))
        assertEquals(State.TENNESSEE, State.get("tn"))
        assertEquals(State.TEXAS, State.get("tx"))
        assertEquals(State.UTAH, State.get("ut"))
        assertEquals(State.VERMONT, State.get("vt"))
        assertEquals(State.VIRGINIA, State.get("va"))
        assertEquals(State.WASHINGTON, State.get("wa"))
        assertEquals(State.WEST_VIRGINIA, State.get("wv"))
        assertEquals(State.WISCONSIN, State.get("wi"))
        assertEquals(State.WYOMING, State.get("wy"))
    }

    void testName() {
        assertEquals("Alabama", State.ALABAMA.get_name())
        assertEquals("Alaska", State.ALASKA.get_name())
        assertEquals("Arizona", State.ARIZONA.get_name())
        assertEquals("Arkansas", State.ARKANSAS.get_name())
        assertEquals("California", State.CALIFORNIA.get_name())
        assertEquals("Colorado", State.COLORADO.get_name())
        assertEquals("Connecticut", State.CONNECTICUT.get_name())
        assertEquals("Delaware", State.DELAWARE.get_name())
        assertEquals("District of Columbia", State.DISTRICT_OF_COLUMBIA.get_name())
        assertEquals("Florida", State.FLORIDA.get_name())
        assertEquals("Georgia", State.GEORGIA.get_name())
        assertEquals("Hawaii", State.HAWAII.get_name())
        assertEquals("Idaho", State.IDAHO.get_name())
        assertEquals("Illinois", State.ILLINOIS.get_name())
        assertEquals("Indiana", State.INDIANA.get_name())
        assertEquals("Iowa", State.IOWA.get_name())
        assertEquals("Kansas", State.KANSAS.get_name())
        assertEquals("Kentucky", State.KENTUCKY.get_name())
        assertEquals("Louisiana", State.LOUISIANA.get_name())
        assertEquals("Maine", State.MAINE.get_name())
        assertEquals("Maryland", State.MARYLAND.get_name())
        assertEquals("Massachusetts", State.MASSACHUSETTS.get_name())
        assertEquals("Michigan", State.MICHIGAN.get_name())
        assertEquals("Minnesota", State.MINNESOTA.get_name())
        assertEquals("Mississippi", State.MISSISSIPPI.get_name())
        assertEquals("Missouri", State.MISSOURI.get_name())
        assertEquals("Montana", State.MONTANA.get_name())
        assertEquals("Nebraska", State.NEBRASKA.get_name())
        assertEquals("Nevada", State.NEVADA.get_name())
        assertEquals("New Hampshire", State.NEW_HAMPSHIRE.get_name())
        assertEquals("New Jersey", State.NEW_JERSEY.get_name())
        assertEquals("New Mexico", State.NEW_MEXICO.get_name())
        assertEquals("New York", State.NEW_YORK.get_name())
        assertEquals("North Carolina", State.NORTH_CAROLINA.get_name())
        assertEquals("North Dakota", State.NORTH_DAKOTA.get_name())
        assertEquals("Ohio", State.OHIO.get_name())
        assertEquals("Oklahoma", State.OKLAHOMA.get_name())
        assertEquals("Oregon", State.OREGON.get_name())
        assertEquals("Pennsylvania", State.PENNSYLVANIA.get_name())
        assertEquals("Rhode Island", State.RHODE_ISLAND.get_name())
        assertEquals("South Carolina", State.SOUTH_CAROLINA.get_name())
        assertEquals("South Dakota", State.SOUTH_DAKOTA.get_name())
        assertEquals("Tennessee", State.TENNESSEE.get_name())
        assertEquals("Texas", State.TEXAS.get_name())
        assertEquals("Utah", State.UTAH.get_name())
        assertEquals("Vermont", State.VERMONT.get_name())
        assertEquals("Virginia", State.VIRGINIA.get_name())
        assertEquals("Washington", State.WASHINGTON.get_name())
        assertEquals("West Virginia", State.WEST_VIRGINIA.get_name())
        assertEquals("Wisconsin", State.WISCONSIN.get_name())
        assertEquals("Wyoming", State.WYOMING.get_name())
    }

    void testAbbreviation() {
        assertEquals("AL", State.ALABAMA.get_abbreviation())
        assertEquals("AK", State.ALASKA.get_abbreviation())
        assertEquals("AZ", State.ARIZONA.get_abbreviation())
        assertEquals("AR", State.ARKANSAS.get_abbreviation())
        assertEquals("CA", State.CALIFORNIA.get_abbreviation())
        assertEquals("CO", State.COLORADO.get_abbreviation())
        assertEquals("CT", State.CONNECTICUT.get_abbreviation())
        assertEquals("DE", State.DELAWARE.get_abbreviation())
        assertEquals("DC", State.DISTRICT_OF_COLUMBIA.get_abbreviation())
        assertEquals("FL", State.FLORIDA.get_abbreviation())
        assertEquals("GA", State.GEORGIA.get_abbreviation())
        assertEquals("HI", State.HAWAII.get_abbreviation())
        assertEquals("ID", State.IDAHO.get_abbreviation())
        assertEquals("IL", State.ILLINOIS.get_abbreviation())
        assertEquals("IN", State.INDIANA.get_abbreviation())
        assertEquals("IA", State.IOWA.get_abbreviation())
        assertEquals("KS", State.KANSAS.get_abbreviation())
        assertEquals("KY", State.KENTUCKY.get_abbreviation())
        assertEquals("LA", State.LOUISIANA.get_abbreviation())
        assertEquals("ME", State.MAINE.get_abbreviation())
        assertEquals("MD", State.MARYLAND.get_abbreviation())
        assertEquals("MA", State.MASSACHUSETTS.get_abbreviation())
        assertEquals("MI", State.MICHIGAN.get_abbreviation())
        assertEquals("MN", State.MINNESOTA.get_abbreviation())
        assertEquals("MS", State.MISSISSIPPI.get_abbreviation())
        assertEquals("MO", State.MISSOURI.get_abbreviation())
        assertEquals("MT", State.MONTANA.get_abbreviation())
        assertEquals("NE", State.NEBRASKA.get_abbreviation())
        assertEquals("NV", State.NEVADA.get_abbreviation())
        assertEquals("NH", State.NEW_HAMPSHIRE.get_abbreviation())
        assertEquals("NJ", State.NEW_JERSEY.get_abbreviation())
        assertEquals("NM", State.NEW_MEXICO.get_abbreviation())
        assertEquals("NY", State.NEW_YORK.get_abbreviation())
        assertEquals("NC", State.NORTH_CAROLINA.get_abbreviation())
        assertEquals("ND", State.NORTH_DAKOTA.get_abbreviation())
        assertEquals("OH", State.OHIO.get_abbreviation())
        assertEquals("OK", State.OKLAHOMA.get_abbreviation())
        assertEquals("OR", State.OREGON.get_abbreviation())
        assertEquals("PA", State.PENNSYLVANIA.get_abbreviation())
        assertEquals("RI", State.RHODE_ISLAND.get_abbreviation())
        assertEquals("SC", State.SOUTH_CAROLINA.get_abbreviation())
        assertEquals("SD", State.SOUTH_DAKOTA.get_abbreviation())
        assertEquals("TN", State.TENNESSEE.get_abbreviation())
        assertEquals("TX", State.TEXAS.get_abbreviation())
        assertEquals("UT", State.UTAH.get_abbreviation())
        assertEquals("VT", State.VERMONT.get_abbreviation())
        assertEquals("VA", State.VIRGINIA.get_abbreviation())
        assertEquals("WA", State.WASHINGTON.get_abbreviation())
        assertEquals("WV", State.WEST_VIRGINIA.get_abbreviation())
        assertEquals("WI", State.WISCONSIN.get_abbreviation())
        assertEquals("WY", State.WYOMING.get_abbreviation())
    }
}
