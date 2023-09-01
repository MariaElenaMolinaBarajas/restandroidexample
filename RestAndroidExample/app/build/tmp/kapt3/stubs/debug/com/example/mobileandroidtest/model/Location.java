package com.example.mobileandroidtest.model;

/**
 * Location data class
 * @author memb
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u000bH\u00c6\u0003J\t\u0010!\u001a\u00020\rH\u00c6\u0003JO\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u00c6\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\bH\u00d6\u0001J\t\u0010\'\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006("}, d2 = {"Lcom/example/mobileandroidtest/model/Location;", "", "city", "", "coordinates", "Lcom/example/mobileandroidtest/model/Coordinates;", "country", "postcode", "", "state", "street", "Lcom/example/mobileandroidtest/model/Street;", "timezone", "Lcom/example/mobileandroidtest/model/Timezone;", "(Ljava/lang/String;Lcom/example/mobileandroidtest/model/Coordinates;Ljava/lang/String;ILjava/lang/String;Lcom/example/mobileandroidtest/model/Street;Lcom/example/mobileandroidtest/model/Timezone;)V", "getCity", "()Ljava/lang/String;", "getCoordinates", "()Lcom/example/mobileandroidtest/model/Coordinates;", "getCountry", "getPostcode", "()I", "getState", "getStreet", "()Lcom/example/mobileandroidtest/model/Street;", "getTimezone", "()Lcom/example/mobileandroidtest/model/Timezone;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Location {
    @com.google.gson.annotations.SerializedName(value = "city")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String city = null;
    @com.google.gson.annotations.SerializedName(value = "coordinates")
    @org.jetbrains.annotations.NotNull
    private final com.example.mobileandroidtest.model.Coordinates coordinates = null;
    @com.google.gson.annotations.SerializedName(value = "country")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String country = null;
    @com.google.gson.annotations.SerializedName(value = "postcode")
    private final int postcode = 0;
    @com.google.gson.annotations.SerializedName(value = "state")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String state = null;
    @com.google.gson.annotations.SerializedName(value = "street")
    @org.jetbrains.annotations.NotNull
    private final com.example.mobileandroidtest.model.Street street = null;
    @com.google.gson.annotations.SerializedName(value = "timezone")
    @org.jetbrains.annotations.NotNull
    private final com.example.mobileandroidtest.model.Timezone timezone = null;
    
    public Location(@org.jetbrains.annotations.NotNull
    java.lang.String city, @org.jetbrains.annotations.NotNull
    com.example.mobileandroidtest.model.Coordinates coordinates, @org.jetbrains.annotations.NotNull
    java.lang.String country, int postcode, @org.jetbrains.annotations.NotNull
    java.lang.String state, @org.jetbrains.annotations.NotNull
    com.example.mobileandroidtest.model.Street street, @org.jetbrains.annotations.NotNull
    com.example.mobileandroidtest.model.Timezone timezone) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.mobileandroidtest.model.Coordinates getCoordinates() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCountry() {
        return null;
    }
    
    public final int getPostcode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.mobileandroidtest.model.Street getStreet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.mobileandroidtest.model.Timezone getTimezone() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.mobileandroidtest.model.Coordinates component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.mobileandroidtest.model.Street component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.mobileandroidtest.model.Timezone component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.mobileandroidtest.model.Location copy(@org.jetbrains.annotations.NotNull
    java.lang.String city, @org.jetbrains.annotations.NotNull
    com.example.mobileandroidtest.model.Coordinates coordinates, @org.jetbrains.annotations.NotNull
    java.lang.String country, int postcode, @org.jetbrains.annotations.NotNull
    java.lang.String state, @org.jetbrains.annotations.NotNull
    com.example.mobileandroidtest.model.Street street, @org.jetbrains.annotations.NotNull
    com.example.mobileandroidtest.model.Timezone timezone) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}