public class PaintJob {
            public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

                if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
                    return -1;
                }
                // calculate area
                double area = width * height;

                // calculate how many cans for the job
                double totalBuckets = area / areaPerBucket;

                // subtract cans for the job with cans at home
                totalBuckets -= extraBuckets;

                return (int) Math.ceil(totalBuckets);
            }

            public static int getBucketCount(double width, double height, double areaPerBucket) {

                if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
                    return -1;
                }
                // calculate area
                double area = width * height;

                // calculate how many cans for the job
                double totalBuckets = area / areaPerBucket;

                return (int) Math.ceil(totalBuckets);
            }

            public static int getBucketCount(double area, double areaPerBucket) {

                if (area <= 0 || areaPerBucket <= 0) {
                    return -1;
                }

                // calculate how many cans for the job
                double totalBuckets = area / areaPerBucket;

                return (int) Math.ceil(totalBuckets);
            }

        }
    }
}