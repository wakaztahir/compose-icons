package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.Drafts: ImageVector
    get() {
        if (_drafts != null) {
            return _drafts!!
        }
        _drafts = Builder(name = "Drafts", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.8782f, 2.8256f)
                lineTo(21.0312f, 2.97f)
                lineTo(21.1755f, 3.1229f)
                curveTo(22.4268f, 4.5282f, 22.3787f, 6.6831f, 21.0312f, 8.0306f)
                lineTo(9.0628f, 19.999f)
                curveTo(8.786f, 20.2758f, 8.4416f, 20.4757f, 8.0639f, 20.5787f)
                lineTo(2.9482f, 21.9739f)
                curveTo(2.3883f, 22.1266f, 1.8746f, 21.6128f, 2.0273f, 21.053f)
                lineTo(3.4224f, 15.9373f)
                curveTo(3.5255f, 15.5595f, 3.7253f, 15.2152f, 4.0022f, 14.9383f)
                lineTo(15.9705f, 2.97f)
                curveTo(17.3181f, 1.6224f, 19.473f, 1.5743f, 20.8782f, 2.8256f)
                close()
                moveTo(15.001f, 6.0609f)
                lineTo(5.0628f, 15.999f)
                curveTo(4.9705f, 16.0913f, 4.9039f, 16.206f, 4.8696f, 16.332f)
                lineTo(3.8197f, 20.1814f)
                lineTo(7.6692f, 19.1315f)
                curveTo(7.7951f, 19.0972f, 7.9099f, 19.0306f, 8.0022f, 18.9383f)
                lineTo(17.94f, 8.9999f)
                lineTo(15.001f, 6.0609f)
                close()
                moveTo(6.5258f, 10.9999f)
                lineTo(5.0258f, 12.4999f)
                lineTo(2.7508f, 12.5003f)
                curveTo(2.3366f, 12.5003f, 2.0008f, 12.1645f, 2.0008f, 11.7503f)
                curveTo(2.0008f, 11.3361f, 2.3366f, 11.0003f, 2.7508f, 11.0003f)
                lineTo(6.5258f, 10.9999f)
                close()
                moveTo(10.5258f, 6.9999f)
                lineTo(9.0258f, 8.4999f)
                lineTo(2.7508f, 8.5003f)
                curveTo(2.3366f, 8.5003f, 2.0008f, 8.1645f, 2.0008f, 7.7503f)
                curveTo(2.0008f, 7.3361f, 2.3366f, 7.0003f, 2.7508f, 7.0003f)
                lineTo(10.5258f, 6.9999f)
                close()
                moveTo(17.0312f, 4.0306f)
                lineTo(16.061f, 4.9999f)
                lineTo(19.0f, 7.9399f)
                lineTo(19.9705f, 6.97f)
                curveTo(20.7822f, 6.1583f, 20.7822f, 4.8423f, 19.9705f, 4.0306f)
                curveTo(19.1588f, 3.219f, 17.8428f, 3.219f, 17.0312f, 4.0306f)
                close()
                moveTo(14.5258f, 2.9999f)
                lineTo(13.0258f, 4.4999f)
                lineTo(2.7508f, 4.5003f)
                curveTo(2.3366f, 4.5003f, 2.0008f, 4.1645f, 2.0008f, 3.7503f)
                curveTo(2.0008f, 3.3361f, 2.3366f, 3.0003f, 2.7508f, 3.0003f)
                lineTo(14.5258f, 2.9999f)
                close()
            }
        }
        .build()
        return _drafts!!
    }

private var _drafts: ImageVector? = null