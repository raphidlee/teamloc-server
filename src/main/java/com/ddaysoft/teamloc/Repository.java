package com.ddaysoft.teamloc.repository;

public class Repository {
    static Map<Member, List<Location>> locations;
    @PostConstruct
    public void init(){
        Repository.locations = new HashMap<>();
    }
    public void pushLocation(Member member, Location location){
        Repository.locations
    }
}
