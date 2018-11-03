package com.manish.model;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import java.util.Date;

@Data
@Entity
@Table(name = "order_to_ship")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, insertable = false)
    protected Long id;

    @Column(name = "created_by", updatable = false, length = 50)
    protected String createdBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_on", nullable = false, insertable = true, updatable = false)
    protected Date createdOn;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_modified_on", nullable = false, insertable = true, updatable = true)
    protected Date lastModifiedOn;

    @Version
    @Column(name = "version")
    protected Long version = 0L;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "address")
    private String address;

    @Column(name = "address_id")
    private String addressId;

    @Column(name = "locality")
    private String locality;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "country")
    private String country;

    @Column(name = "zipcode")
    private String zipcode;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "email")
    private String email;

    @Column(name = "is_cod")
    private Boolean cod;

    @Column(name = "cod_amount")
    private Double codAmount;

    @Column(name = "cust_mobile")
    private String custMobile;

    @Column(name = "warehouse_id")
    private String warehouseId;

    @Column(name = "delivery_center_id")
    private Long deliveryCenterId;

    @Column(name = "destination_hub_code")
    private String destinationHubCode;

    @Column(name = "sales_order_id")
    private String salesOrderId;

    @Column(name = "packed_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date packedOn = new Date();

    @Column(name = "inscanned_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date inscannedOn;

    @Column(name = "shipped_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date shippedOn;

    @Column(name = "promise_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date promiseDate;

    @Column(name="store_id")
    private Long storeId;

    @Column(name = "rto_warehouse_id")
    private String rtoWarehouseId;

    @Column(name = "destination_premises_id")
    private String destinationPremisesId;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "rto_received_date")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date rtoedReceivedOn;

    @Column(name = "cod_amount_collected")
    private Float codAmountCollected;

    @Column(name = "try_and_buy_duration")
    private Long triedAndBoughtDuration;

    @Column(name = "additional_collectable_charges")
    private Float additionalCollectableCharges;

    @Column(name = "courier_code")
    private String courierCode;

    @Column(name = "tracking_number")
    private String trackingNumber;

    @Column(name = "dispatch_hub_code")
    private String dispatchHubCode;

    @Column(name = "rto_hub_code")
    private String rtoHubCode;

    @Column(name = "landmark")
    private String landmark;

    @Column(name = "source_id")
    private String sourceId;

    @Column(name = "client_id")
    private String clientId;

    @Column(name = "integration_id")
    private String integrationId;

    @Column(name = "finance_settled_on")
    private Date financeSettledOn;

    @Column(name="exchange_pickup_id")
    private Long exchangePickupId;

    @Column(name = "store_partner_id")
    private String storePartnerId;

    @Column(name = "shipment_route")
    private String shipmentRoute;
}
