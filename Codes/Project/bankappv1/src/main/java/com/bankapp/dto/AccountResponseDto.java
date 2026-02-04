package com.bankapp.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountResponseDto {
	private Integer accountNumber;
	private String ownerName;
	private BigDecimal balance;

	private String ifscCode;

}
