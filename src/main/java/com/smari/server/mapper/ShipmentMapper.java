package com.smari.server.mapper;

import com.smari.server.dto.ShipmentModel;
import com.smari.server.entity.Shipment;
/**
 * Mapper utility for converting DTO to entity and entity to DTO
 * @author smari
 */
public class ShipmentMapper {
    public static Shipment convertModelToEntity(ShipmentModel model) {
        Shipment shipment = new Shipment();
        if(model != null){
            if(model.getId() != null) shipment.setId(model.getId());
            shipment.setZipCode(model.getZipCode());
            shipment.setCity(model.getCity());
        }
        return shipment;
    }

    public static ShipmentModel convertEntityToModel(Shipment entity) {
        ShipmentModel shipmentModel = new ShipmentModel();
        if(entity != null){
            if(entity.getId() != null) shipmentModel.setId(entity.getId());
            shipmentModel.setZipCode(entity.getZipCode());
            shipmentModel.setCity(entity.getCity());
        }
        return shipmentModel;
    }
}
