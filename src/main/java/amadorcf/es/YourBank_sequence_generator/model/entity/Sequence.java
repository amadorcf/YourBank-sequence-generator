package amadorcf.es.YourBank_sequence_generator.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Sequence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long sequenceId;

    private long accountNumber;
}
