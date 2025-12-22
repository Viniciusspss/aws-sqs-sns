terraform {
  required_providers {
    aws = {
      source  = "hashicorp/aws"
      version = "~> 5.0"
    }
  }
}

provider "aws" {
  region     = var.auth.region
  access_key = var.auth.access_key
  secret_key = var.auth.secret_key

  skip_credentials_validation = true
  skip_metadata_api_check     = true
  skip_requesting_account_id  = true

  endpoints {
    sns = var.auth.endpoint_url
    sqs = var.auth.endpoint_url
    sts = var.auth.endpoint_url
    dynamodb = var.auth.endpoint_url
  }
}
