package io.github.agentsoz.socialnetwork.util;


// DataServer data types used by the bushfire application
public class DataTypes {

   //SN DATATYPES
   public static final String BDI_STATE_UPDATES    = "bdi_state_updates";
   public static final String RANDOM			   = "random";
   public static final String  SMALL_WORLD		   = "sw"; 
   public static final String RANDOM_REGULAR	   = "rand-reg";
   public static final String SN_PERCEPTS		   = "sn";
   public static final String  ACTIVE	           = "active";
   public static final String INACTIVE		       = "inactive";
   public static final String GAUSSIAN		       = "guassian";
   public static final String ltModel		       = "lt";
   public static final String CLTModel		       = "clt";
   public static final String icModel		       = "ic";
   public static final String GLOBAL               = "global";
   public static final String LOCAL                = "local";
   public static final String TIME                 = "time";
   
   //seeding strategies
   public static final String NEAR_FIRE		   = "nearfire";
   public static final String PROBILITY		   = "prob";
   
   //diffusion states
   public static final String LOW		   = "low";
   public static final String MEDIUM		   = "medium";
   public static final String HIGH		   = "high";

   //contentTypes
   public static final String WAIT  = "wait" ;
   public static final String PANIC  = "panic" ;
   
   //execTypes
   public static String SN_BDI = "SNBDI";


   //BDI DATATYPES
   public static final String MATSIM_AGENT_UPDATES = "matsim_agent_updates";
   public static final String FIRE_ALERT           = "fire_alert";
   public static final String DIFFUSION            = "diffusion";
   public static final String BROADCAST            = "broadcast";
   public static final String FIREALERT 		   = "FireAlert";
   public static final String LEAVENOW		 	   = "leave now";
}
