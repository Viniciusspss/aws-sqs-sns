variable "auth" {
  type = object({
    access_key   = string
    secret_key   = string
    endpoint_url = string
    region       = string
  })
  default = {
    access_key   = "test"
    secret_key   = "test"
    endpoint_url = "http://localhost:4566"
    region       = "sa-east-1"
  }
}
