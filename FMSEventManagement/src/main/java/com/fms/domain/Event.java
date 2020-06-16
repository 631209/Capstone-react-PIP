package com.fms.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("events")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event {
	@Id
	@Column("id")
	private Long id;
	@Column("event_id")
	    private String eventId;
	@Column("month")
	private String month;
	@Column("event_name")
	    private String eventName;
	@Column("description")
	    private String description;
	@Column("startdate")
	    private String startDate;
	@Column("base_location")
	    private String baseLocation;
	@Column("beneficiary_name")
	    private String beneficiaryName;
	@Column("venue_address")
	    private String venueAddress;
	@Column("council_name")
	    private String councilName;
	@Column("project_name")
	    private String projectName;
	@Column("category")
	    private String category;
	@Column("total_volunteer")
	    private String totalVolunteer;
	@Column("total_volunteer_hour")
	    private String totalVolunteerHour;
	@Column("total_travel_hour")
	    private String totalTravelHour;
	@Column("overall_volunteer_hour")
	    private String overallVolunteerHour;
	@Column("lives_impacted")
	    private String livesImpacted;
	@Column("activity_type")
	    private String activityType;
	@Column("status")
	    private String status;
	

}
