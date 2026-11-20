package com.gestetner.servvista.adapter.in.web;

import com.gestetner.servvista.application.dto.meters.MeterReadingResponse;
import com.gestetner.servvista.application.service.MeterReadingService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/meter-readings")
@Tag(name = "Meter Readings")
@PreAuthorize("hasRole('ADMIN')")
public class MeterReadingController {

    private final MeterReadingService meterReadingService;

    public MeterReadingController(MeterReadingService meterReadingService) {
        this.meterReadingService = meterReadingService;
    }

    @GetMapping("/machine/{machineReferenceNumber}")
    @Operation(summary = "Get meter readings by machine reference number")
    public ResponseEntity<List<MeterReadingResponse>> getByMachineReferenceNumber(
            @PathVariable String machineReferenceNumber) {
        return ResponseEntity.ok(
                meterReadingService.getByMachineReferenceNumber(machineReferenceNumber));
    }
}
