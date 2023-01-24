class PercentageRounds {
    public static void main(String[] args) {
        double percentage = 0.0;
        for (int i = 0; i < 100; i++) {
            percentage += 0.01;
        }
        System.out.println(percentage);
    }

    private static String GetPercentageRound(double percentage) {
      if (percentage = 0.0) {
        return "⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜";
      }

      if (percentage > 0.0 && percentage < 0.1) {
        return "✅⬜⬜⬜⬜⬜⬜⬜⬜⬜";
      }

      if (percentage >= 0.1 && percentage < 0.2) {
        return "✅✅⬜⬜⬜⬜⬜⬜⬜⬜";
      }

      if (percentage >= 0.2 && percentage < 0.3) {
        return "✅✅✅⬜⬜⬜⬜⬜⬜⬜";
      }

      if (percentage >= 0.3 && percentage < 0.4) {
        return "✅✅✅✅⬜⬜⬜⬜⬜⬜";
      }

      if (percentage >= 0.4 && percentage < 0.5) {
        return "✅✅✅✅✅⬜⬜⬜⬜⬜";
      }

      if (percentage >= 0.5 && percentage < 0.6) {
        return "✅✅✅✅✅✅⬜⬜⬜⬜";
      }

      if (percentage >= 0.6 && percentage < 0.7) {
        return "✅✅✅✅✅✅✅⬜⬜⬜";
      }

      if (percentage >= 0.7 && percentage < 0.8) {
        return "✅✅✅✅✅✅✅✅⬜⬜";
      }

      if (percentage >= 0.8 && percentage < 0.9) {
        return "✅✅✅✅✅✅✅✅✅⬜";
      }

      return "✅✅✅✅✅✅✅✅✅✅";
    }

    private static String GetPercentageRounds(double percentage) {
      assert 0.0 <= percentage && percentage <= 1.0 : "Percentage must be between 0.0 and 1.0";

      final String[] dots = new String[] {
        "⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜",
        "✅⬜⬜⬜⬜⬜⬜⬜⬜⬜",
        "✅✅⬜⬜⬜⬜⬜⬜⬜⬜",
        "✅✅✅⬜⬜⬜⬜⬜⬜⬜",
        "✅✅✅✅⬜⬜⬜⬜⬜⬜",
        "✅✅✅✅✅⬜⬜⬜⬜⬜",
        "✅✅✅✅✅✅⬜⬜⬜⬜",
        "✅✅✅✅✅✅✅⬜⬜⬜",
        "✅✅✅✅✅✅✅✅⬜⬜",
        "✅✅✅✅✅✅✅✅✅⬜",
        "✅✅✅✅✅✅✅✅✅✅"
      };

      int percentageAsIntBetween0And10 = (int)(percentage * 10);
      return dots[percentageAsIntBetween0And10];
    }
    
}