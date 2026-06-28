package service.userservice.userservice.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "medicines")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Medicine {
    @Id @GeneratedValue(strategy = GenerationType.UUID) private String medicineId;

    // Canonical: medicine_name on the wire. Accept `name` on input AND on
    // output so the frontend can keep using the friendly field name in
    // both directions without breaking callers that still send the
    // snake_case or camelCase form.
    @JsonProperty("medicine_name")
    @JsonAlias({"name", "medicineName"})
    private String medicineName;

    @JsonAlias({"price"})
    private Double price;

    // Canonical: quantity. Frontend posts `stock`; alias keeps both sides happy.
    @JsonProperty("quantity")
    @JsonAlias({"stock"})
    private Integer quantity;

    // Optional catalog metadata (added so the dashboard can show
    // category / manufacturer / expiry without losing them).
    private String category;
    private String manufacturer;

    @JsonProperty("expiry_date")
    @JsonAlias({"expiryDate"})
    private String expiryDate;
}