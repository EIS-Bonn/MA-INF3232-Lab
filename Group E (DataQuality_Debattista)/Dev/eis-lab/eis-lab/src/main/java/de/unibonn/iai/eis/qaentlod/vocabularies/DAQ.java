/* CVS $Id: $ */
package de.unibonn.iai.eis.qaentlod.vocabularies; 
import com.hp.hpl.jena.rdf.model.*;
 
/**
 * Vocabulary definitions from src/main/resources/vocabularies/daq/daq.trig 
 * @author Auto-generated by schemagen on 14 jul 2014 22:54 
 */
public class DAQ {
    /** <p>The RDF model that holds the vocabulary terms</p> */
    private static Model m_model = ModelFactory.createDefaultModel();
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://purl.org/eis/vocab/daq#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    /** <p>Quality metrics can be (in principle) calculated on various forms of data 
     *  (such as datasets, graphs, set of triples etc...). This vocabulary allow the 
     *  owner/user of such RDF data to create multiple quality graphs and identify 
     *  the corresponding dataset resource (e.g. the dataset URI) for the quality 
     *  graph.</p>
     */
    public static final Property computedOn = m_model.createProperty( "http://purl.org/eis/vocab/daq#computedOn" );
    
    /** <p>A timestamp which shows when the metric was computed last</p> */
    public static final Property dateComputed = m_model.createProperty( "http://purl.org/eis/vocab/daq#dateComputed" );
    
    public static final Property doubleValue = m_model.createProperty( "http://purl.org/eis/vocab/daq#doubleValue" );
    
    /** <p>The category concept classifies dimensions related to the measurement of quality 
     *  for a specific criteria. This is an abstract property and should not be used 
     *  directly. Specific sub-properties should be inherited for different dimensions.</p>
     */
    public static final Property hasDimension = m_model.createProperty( "http://purl.org/eis/vocab/daq#hasDimension" );
    
    /** <p>A dimension is an abstract concept which groups an number of more concrete 
     *  metrics to measure quality of a dataset. This is an abstract property and 
     *  should not be used directly. Specific sub-properties should be inherited for 
     *  different metrics.</p>
     */
    public static final Property hasMetric = m_model.createProperty( "http://purl.org/eis/vocab/daq#hasMetric" );
    
    /** <p>A metric might require a number of external resources (e.g. a gold standard) 
     *  in order to be able to measure the quality. In order to cater for the most 
     *  generic requirement, this abstract property links a metric to the required 
     *  resource. This property should not be used directly.</p>
     */
    public static final Property requires = m_model.createProperty( "http://purl.org/eis/vocab/daq#requires" );
    
    /** <p>Each metric will have a value computed. In order to deal with the different 
     *  return type of the metric computation, this generic (abstract) property links 
     *  a metric with a value object (e.g. boolean, double, Literal). This property 
     *  should not be used directly.</p>
     */
    public static final Property value = m_model.createProperty( "http://purl.org/eis/vocab/daq#value" );
    
    /** <p>The highest level of quality metric is a category. A category groups a number 
     *  of dimensions relevant to each other which aims at measuring the quality of 
     *  a dataset from different aspects. Categories are provided as subclasses of 
     *  this abstract class, which is not intended for direct usage.</p>
     */
    public static final Resource Category = m_model.createResource( "http://purl.org/eis/vocab/daq#Category" );
    
    /** <p>Each dimension is part of a larger group called category (See daq:Category). 
     *  Each dimension has a number of metrics which are associated to it. A dimension 
     *  is linked with a category using the daq:hasDimension property. Dimensions 
     *  are provided as subclasses of this abstract class, which is not intended for 
     *  direct usage.</p>
     */
    public static final Resource Dimension = m_model.createResource( "http://purl.org/eis/vocab/daq#Dimension" );
    
    /** <p>The smallest unit of measuring a quality dimension is a metric. Each metric 
     *  have a value which is associated to the quality computed. Since this value 
     *  is multi-typed (i.e. one metric might return true/false whilst another might 
     *  require a double value), then the value's (daq:hasValue) range is inherited 
     *  by the metric's attributes. A metric might also require additional information 
     *  (e.g. a gold standard dataset to compare with). Therefore, a concrete metric 
     *  representation shall also define such properties (see daq:requires). Metrics 
     *  are provided as subclasses of this abstract class, which is not intended for 
     *  direct usage.</p>
     */
    public static final Resource Metric = m_model.createResource( "http://purl.org/eis/vocab/daq#Metric" );
    
    /** <p>Defines a quality graph which will contain all metadata about quality metrics 
     *  on the dataset.</p>
     */
    public static final Resource QualityGraph = m_model.createResource( "http://purl.org/eis/vocab/daq#QualityGraph" );
    
    /** <p>The Dataset Quality Vocabulary (daQ) is a lightweight, extensible core vocabulary 
     *  for attaching the result of quality benchmarking of a linked open dataset 
     *  (usually an expensive process) to that dataset. daQ is designed to be extended 
     *  by custom quality metrics. Use cases include filtering and ranking datasets 
     *  by quality.</p>
     */
    public static final Resource __ = m_model.createResource( "http://purl.org/eis/vocab/daq#" );
    
}
