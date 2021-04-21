package com.honbow.model;

public enum MarketPlaces {
    DE("https://sellingpartnerapi-eu.amazon.com", "A1PA6795UKMFR9", "eucentral-1"),
    UK("https://sellingpartnerapi-eu.amazon.com", "A1F83G8C2ARO7P", "eu-west-2"),
    FR("https://sellingpartnerapi-eu.amazon.com", "A13V1IB3VIYZZH", "eu-west-3"),
    IT("https://sellingpartnerapi-eu.amazon.com", "APJ6JRA9NG5V4", "eu-south-1"),
    ES("https://sellingpartnerapi-eu.amazon.com", "A1RKKUPIHCS9HS"),

    AE("https://sellingpartnerapi-eu.amazon.com", "A2VIGQ35RCS4UG"),
    EG("https://sellingpartnerapi-eu.amazon.com", "ARBP9OOSHTCHU"),
    IN("https://sellingpartnerapi-eu.amazon.com", "A21TJRUUN4KGV"),
    NL("https://sellingpartnerapi-eu.amazon.com", "A1805IZSGTT6HS"),
    SA("https://sellingpartnerapi-eu.amazon.com", "A17E79C6D8DWNP"),
    SE("https://sellingpartnerapi-eu.amazon.com", "A2NODRKZP88ZB9"),
    TR("https://sellingpartnerapi-eu.amazon.com", "A33AVAJ2PDY3EV"),

    AU("https://sellingpartnerapi-fe.amazon.com", "A39IBJ37TRP1C6", "ap-southeast-2"),
    JP("https://sellingpartnerapi-fe.amazon.com", "A1VC38T7YXB528", "ap-northeast-1"),
    SG("https://sellingpartnerapi-fe.amazon.com", "A19VAU5U5O7RUS", "ap-southeast-1"),

    US("https://sellingpartnerapi-na.amazon.com", "ATVPDKIKX0DER", "us-east-1"),
    BR("https://sellingpartnerapi-na.amazon.com", "A2Q3Y263D00KWC", "us-east-1"),
    CA("https://sellingpartnerapi-na.amazon.com", "A2EUQ1WTGCTBG2", "ca-central-1"),
    MX("https://sellingpartnerapi-na.amazon.com", "A1AM78C64UM0Y8", "us-east-1");


    private final String marketPlaceID;
    private final String endpoint;
    private final String region;

    MarketPlaces(String endpoint, String marketPlaceID, String region) {
        this.marketPlaceID = marketPlaceID;
        this.endpoint = endpoint;
        this.region = region;

    }

    MarketPlaces(String endpoint, String marketPlaceID) {
        this(endpoint, marketPlaceID, null);

    }

    public String getMarketPlaceID() {
        return marketPlaceID;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public String getRegion() {
        return region;
    }
}
