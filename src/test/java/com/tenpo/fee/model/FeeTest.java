package com.tenpo.fee.model;

import com.tenpo.fee.dto.Fee;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FeeTest {

    @Test
    public void createFee() {
        Fee fee = new Fee(5.0);
        assertThat(fee.getFee()).isEqualTo(5.0);
    }
}
