package com.fms.domain;


import java.util.List;

import org.springframework.data.relational.core.mapping.Column;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventsDto {
	
	private Event event;
	private List<FeedbackResponse> feedbackResponses;
	private List<EventEmployee> eventEmployeeList;

}
