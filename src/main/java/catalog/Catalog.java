package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem catalogItem) {
        catalogItems.add(catalogItem);
    }

    public double averagePageNumberOver(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Page number must be positive");
        }
        if (i >= 10000) {
            throw new IllegalArgumentException("No page");
        }

        int result = 0;
        int items = 0;
        for (CatalogItem catalogItem : catalogItems) {
            int pages = catalogItem.numberOfPagesAtOneItem();
            if (pages >= i) {
                result += pages;
                items++;
            }
        }
        if (items == 0) {
            return 0;
        } else {
            return (double) result / items;
        }
    }

    public void deleteItemByRegistrationNumber(String s) {
        int i = 0;
        while (i < catalogItems.size()) {
            if (catalogItems.get(i).getRegistrationNumber().equals(s)) {
                catalogItems.remove(i);
            } else {
                i++;
            }
        }

    }

    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria) {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems) {
            if (needByContributionCriteria(searchCriteria, catalogItem)
                    && needByTitleCriteria(searchCriteria, catalogItem)) {
                result.add(catalogItem);
            }
        }
        return result;
    }

    private boolean needByContributionCriteria(SearchCriteria searchCriteria, CatalogItem catalogItem) {
        return !searchCriteria.hasContributor() ||
                catalogItem.getContributors().contains(searchCriteria.getContributor());
    }

    private boolean needByTitleCriteria(SearchCriteria searchCriteria, CatalogItem catalogItem) {
        return !searchCriteria.hasTitle() ||
                catalogItem.getTitles().contains(searchCriteria.getTitle());
    }

    public List<CatalogItem> getAudioLibraryItems() {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.hasAudioFeature()) {
                result.add(catalogItem);
            }
        }
        return result;
    }

    public List<CatalogItem> getPrintedLibraryItems() {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.hasPrintedFeature()) {
                result.add(catalogItem);
            }
        }
        return result;
    }

    public int getAllPageNumber() {
        int result = 0;
        for (CatalogItem catalogItem : catalogItems) {
            result += catalogItem.numberOfPagesAtOneItem();
        }
        return result;
    }

    public int getFullLength() {
        int result = 0;
        for (CatalogItem catalogItem : catalogItems) {
            result += catalogItem.fullLengthAtOneItem();
        }
        return result;
    }
}
