package com.amazingcode.in.example.visa.external.request;

public class ForexRateRequest {

    private String destinationCurrencyCode;
    private String rateProductCode;
    private String sourceAmount;
    private String sourceCurrencyCode;
    private String markupRate;
    private AcquirerDetails acquirerDetails;

    // Getters and Setters

    public String getDestinationCurrencyCode() {
        return destinationCurrencyCode;
    }

    public void setDestinationCurrencyCode(String destinationCurrencyCode) {
        this.destinationCurrencyCode = destinationCurrencyCode;
    }

    public String getRateProductCode() {
        return rateProductCode;
    }

    public void setRateProductCode(String rateProductCode) {
        this.rateProductCode = rateProductCode;
    }

    public String getSourceAmount() {
        return sourceAmount;
    }

    public void setSourceAmount(String sourceAmount) {
        this.sourceAmount = sourceAmount;
    }

    public String getSourceCurrencyCode() {
        return sourceCurrencyCode;
    }

    public void setSourceCurrencyCode(String sourceCurrencyCode) {
        this.sourceCurrencyCode = sourceCurrencyCode;
    }

    public String getMarkupRate() {
        return markupRate;
    }

    public void setMarkupRate(String markupRate) {
        this.markupRate = markupRate;
    }

    public AcquirerDetails getAcquirerDetails() {
        return acquirerDetails;
    }

    public void setAcquirerDetails(AcquirerDetails acquirerDetails) {
        this.acquirerDetails = acquirerDetails;
    }

    // Inner class for AcquirerDetails
    public static class AcquirerDetails {

        private String bin;
        private Settlement settlement;

        // Getters and Setters

        public String getBin() {
            return bin;
        }

        public void setBin(String bin) {
            this.bin = bin;
        }

        public Settlement getSettlement() {
            return settlement;
        }

        public void setSettlement(Settlement settlement) {
            this.settlement = settlement;
        }

        // Inner class for Settlement
        public static class Settlement {
            private String currencyCode;

            // Getters and Setters
            public String getCurrencyCode() {
                return currencyCode;
            }

            public void setCurrencyCode(String currencyCode) {
                this.currencyCode = currencyCode;
            }
        }
    }
}

