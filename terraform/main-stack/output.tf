output "sqs_queue_url" {
  value = aws_sqs_queue.this.id
}

output "sns_topic_arn" {
  value = aws_sns_topic.this.arn
}