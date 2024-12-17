public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || obj.getClass() != this.getClass())
            return false;
        ComplexNumber other = (ComplexNumber) obj;
        if (other.re == this.re && other.im == this.im)
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        return (int)(Double.hashCode(re) + Double.hashCode(im));
    }

}
