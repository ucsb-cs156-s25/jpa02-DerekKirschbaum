package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }
    @Test
    public void equals_returns_correct_boolean() {
        Developer dev = null;
        Team t2 = new Team("test-team");
        Team t3 = new Team("test-team1");
        Team t4 = new Team("test-team");
        t4.addMember("bob");


        assertEquals(true, team.equals(team));
        assertEquals(false, team.equals(dev));
        assertEquals(true, team.equals(t2));
        assertEquals(false, team.equals(t3));
        assertEquals(false, team.equals(t4));
    }

    @Test
    public void hashCode_returns_correct_int() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");
        int result = t1.hashCode();
        int expectedResult = 130294;
        assertEquals(expectedResult, result);
        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");
        assertEquals(expectedResult, t2.hashCode());
    }

}
