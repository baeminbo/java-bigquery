/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.bigquery;

import com.google.api.services.bigquery.model.QueryParameter;
import java.util.List;

public class BigQueryDryRunResultImpl implements BigQueryDryRunResult {
  private Schema schema;
  private List<QueryParameter> queryParameters;

  BigQueryDryRunResultImpl(
      Schema schema, List<QueryParameter> queryParameters) { // Package-Private access
    this.schema = schema;
    this.queryParameters = queryParameters;
  }

  @Override
  public Schema getSchema() throws BigQuerySQLException {
    return schema;
  }

  @Override
  public List<QueryParameter> getQueryParameters() throws BigQuerySQLException {
    return queryParameters;
  }
}
