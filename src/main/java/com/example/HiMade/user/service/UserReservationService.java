package com.example.HiMade.user.service;

import com.example.HiMade.user.dto.UserRL;
import com.example.HiMade.user.dto.UserRSlotDTO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface UserReservationService {

  public List<UserRL> getMyReserveList();
  public List<UserRSlotDTO> getDateTime(LocalDate Date);
}
