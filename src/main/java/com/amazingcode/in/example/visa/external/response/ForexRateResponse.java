package com.amazingcode.in.example.visa.external.response;

public class ForexRateResponse {

    private String conversionRate;
    private String destinationAmount;
    private String rateProductCode;
    private String markupRateApplied;
    private String sourceAmountWithoutMarkup;
    private AcquirerDetails acquirerDetails;

    // Getters and Setters

    public String getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(String conversionRate) {
        this.conversionRate = conversionRate;
    }

    public String getDestinationAmount() {
        return destinationAmount;
    }

    public void setDestinationAmount(String destinationAmount) {
        this.destinationAmount = destinationAmount;
    }

    public String getRateProductCode() {
        return rateProductCode;
    }

    public void setRateProductCode(String rateProductCode) {
        this.rateProductCode = rateProductCode;
    }

    public String getMarkupRateApplied() {
        return markupRateApplied;
    }

    public void setMarkupRateApplied(String markupRateApplied) {
        this.markupRateApplied = markupRateApplied;
    }

    public String getSourceAmountWithoutMarkup() {
        return sourceAmountWithoutMarkup;
    }

    public void setSourceAmountWithoutMarkup(String sourceAmountWithoutMarkup) {
        this.sourceAmountWithoutMarkup = sourceAmountWithoutMarkup;
    }

    public AcquirerDetails getAcquirerDetails() {
        return acquirerDetails;
    }

    public void setAcquirerDetails(AcquirerDetails acquirerDetails) {
        this.acquirerDetails = acquirerDetails;
    }

    // Inner class for AcquirerDetails
    public static class AcquirerDetails {

        private Settlement settlement;

        // Getters and Setters

        public Settlement getSettlement() {
            return settlement;
        }

        public void setSettlement(Settlement settlement) {
            this.settlement = settlement;
        }

        // Inner class for Settlement
        public static class Settlement {
            private String currencyCode;
            private String amount;
            private String conversionRate;

            // Getters and Setters
            public String getCurrencyCode() {
                return currencyCode;
            }

            public void setCurrencyCode(String currencyCode) {
                this.currencyCode = currencyCode;
            }

            public String getAmount() {
                return amount;
            }

            public void setAmount(String amount) {
                this.amount = amount;
            }

            public String getConversionRate() {
                return conversionRate;
            }

            public void setConversionRate(String conversionRate) {
                this.conversionRate = conversionRate;
            }
        }
    }
}

