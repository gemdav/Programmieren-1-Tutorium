def pow(base, exponent=2):
    '''
    Definition
    ----------
    Calculates the power

    Parameters
    ----------
    base: numeric
        the base of the calculation

    exponent: numeric
        the exponent of the calculation

    Returns
    -------
    the result of the calculation
    '''
    return base ** exponent


print(pow(2))  # expected: 4
print(pow(2, 3))  # expected: 8
