package annotatorstub.annotator.smaph;

import annotatorstub.annotator.tagme.TagMeAnnotator;
import it.unipi.di.acube.batframework.data.ScoredAnnotation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * A class to mock up some data sources to be used in the SMAPH-S annotator.
 * All the functions actually need a query argument, but we can do this in the constructor of the class later.
 */
public class SmaphSMockDataSources {
    /**
     * Returns a set of candidate entities from the output of TagMeAnnotator.
     *
     * @param query the query as a string
     * @return a set of integers, each corresponding to a Wikipedia ID of a candidate entity.
     */
    public static Set<Integer> getEpsilonSet1(String query) { return new HashSet<>(); }

    public static Set<Integer> getEpsilonSet2(String query) {
        return new HashSet<>();
    }

    public static Set<Integer> getEpsilonSet3(String query) {
        return new HashSet<>();
    }


    /**
     * Total total number of web pages found by Bing for query.
     * W(q) in article.
     */
    public static Long getBingTotalResults() { return 0L; }

    /**
     * List of URLs returned by Bing for query. First URL is that of the highest-rank result, etc.
     * U(q) in article.
     */
    public static List<String> getBingURLs() { return new ArrayList<>(); }

    /**
     * List of snippets returned by Bing for query. First snippet is that of the highest-rank result, etc.
     * C(q) in article.
     */
    public static List<String> getBingSnippets() { return new ArrayList<>(); }

    /**
     * The multi-set of bold portions of all snippets returned by Bing for query. Implemented as a List because we just
     * need to iterate over all elements (possibly twice if they occurred twice).
     * B(q) in article.
     */
    public static List<String> getBingBoldPortions() { return new ArrayList<>(); }


    /**
     * The set of annotations (mention-entity pairs) found by our auxiliary annotator WAT in snippet s
     * overlapping with a bold portion of the snippet.
     * A(s) in article.
     * @param s snippet to annotate
     */
    public static Set<ScoredAnnotation> getWATBoldAnnotations(String s) { return new HashSet<>(); }

    /**
     * Get the Wikipedia graph PageRank score of given entity.
     */
    public static Double getWikiPageRankScore(Integer entity) { return 0.0; }


    /**
     * Get the link probability of given mention in the Wikipedia corpus.
     */
    public static Double getWikiLinkProbability(String mention) { return 0.0; }

    /**
     * Get the commonness of given mention-entity pair in the Wikipedia corpus.
     */
    public static Double getWikiCommonness(String mention, int entity) { return 0.0; }

    /**
     * Get the ambiguity (number of distinct Wikipedia pages that the mention points to) in the Wikipedia corpus.
     */
    public static Double getWikiAmbiguity(String mention) { return 0.0; }

    /**
     * Get the number of times (frequency) that the given entity has been linked in Wikipedia pages by the given anchor.
     * F(e, a) in the article.
     */
    public static Integer getWikiEntityAnchorLinkCount(Integer entity, String anchor) {
        return 0;
    }

    /**
     * Get the set of anchors used in Wikipedia to link the given entity.
     * G(e) in the article.
     */
    public static Set<String> getWikiAnchorsLinkingToEntity(Integer entity) {
        return new HashSet<>();
    }
}
