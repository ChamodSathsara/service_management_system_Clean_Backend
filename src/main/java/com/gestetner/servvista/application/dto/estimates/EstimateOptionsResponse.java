package com.gestetner.servvista.application.dto.estimates;

import com.gestetner.servvista.application.dto.catalog.MachineModelResponse;
import com.gestetner.servvista.application.dto.identity.TechnicianUserResponse;
import com.gestetner.servvista.application.dto.machines.MachineResponse;
import com.gestetner.servvista.application.dto.parts.PartCategoryResponse;
import com.gestetner.servvista.application.dto.parts.PartResponse;
import java.util.List;

public record EstimateOptionsResponse(
        List<MachineResponse> machines,
        List<TechnicianUserResponse> technicians,
        List<MachineModelResponse> models,
        List<PartCategoryResponse> categories,
        List<PartResponse> parts) {
}
