package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "concerts")
public class Concert {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  @Column(name = "band")
  private String band;

  @Column(name = "venue")
  private String venue;

  @Column(name = "starttime")
  private Timestamp startTime;

  @Column(name = "endtime")
  private Timestamp endTime;

  @Column(name = "soldout")
  private boolean soldOut;

  @Column(name = "city")
  private String city;

  public String toString() {
    return "[ Band: "
        + band
        + ", Venue: "
        + venue
        + ", Start Time: "
        + startTime
        + ", End Time: "
        + endTime
        + ", Sold Out: "
        + soldOut
        + ", City: "
        + city
        + " ]";
  }
}
