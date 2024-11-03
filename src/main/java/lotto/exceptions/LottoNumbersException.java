package lotto.exceptions;

import static lotto.constamts.ExceptionDisplayConstants.USER_INPUT_ERROR_PREFIX;

public class LottoNumbersException extends IllegalArgumentException{
    private static final String MESSAGE = USER_INPUT_ERROR_PREFIX + " 로또 번호는 1부터 45 사이의 숫자여야 합니다.";

    public LottoNumbersException() {
        super(MESSAGE);
    }
}
