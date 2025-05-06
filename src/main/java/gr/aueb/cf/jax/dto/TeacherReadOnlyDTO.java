package gr.aueb.cf.jax.dto;

/**
 * DTO ως record, (Είναι ότι πρέπει για dto)
 * Record είναι private final στο default
 * Παρέχει αυτόματα constructor (ονομάζεται canonical)
 * Αυτόματα Getters, equals, hashcode, toString
 *
 */
public record TeacherReadOnlyDTO(
        Long id,
        String ssn,
        String firstname,
        String lastname
) {}
