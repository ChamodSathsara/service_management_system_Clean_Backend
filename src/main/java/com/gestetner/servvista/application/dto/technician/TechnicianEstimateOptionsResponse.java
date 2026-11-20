package com.gestetner.servvista.application.dto.technician;

import com.gestetner.servvista.application.dto.catalog.MachineModelResponse;
import com.gestetner.servvista.application.dto.parts.PartCategoryResponse;
import com.gestetner.servvista.application.dto.parts.PartResponse;
import java.util.List;

public record TechnicianEstimateOptionsResponse(
        List<TechnicianEstimateMachineOption> machines,
        List<MachineModelResponse> models,
        List<PartCategoryResponse> categories,
        List<PartResponse> parts) {
}
